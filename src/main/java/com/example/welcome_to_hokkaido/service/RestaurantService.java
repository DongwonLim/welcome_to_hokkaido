package com.example.welcome_to_hokkaido.service;

import com.example.welcome_to_hokkaido.domain.dto.RestaurantDTO;
import com.example.welcome_to_hokkaido.domain.entity.MemberEntity;
import com.example.welcome_to_hokkaido.domain.entity.RestaurantEntity;
import com.example.welcome_to_hokkaido.repository.MemberRepository;
import com.example.welcome_to_hokkaido.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final MemberRepository memberRepository;

    public List<RestaurantDTO> getList() {
        List<RestaurantEntity> entities = restaurantRepository.findAll();
        List<RestaurantDTO> dtoList = new ArrayList<>();

        for (RestaurantEntity entity : entities) {
            RestaurantDTO dto = RestaurantDTO.builder()
                    .restaurantId(entity.getRestaurantId())
                    .restaurantTitle(entity.getRestaurantTitle())
                    .restaurantContent(entity.getRestaurantContent())
                    .restaurantDate(entity.getRestaurantDate())
                    .restaurantRating(entity.getRestaurantRating())
                    .restaurantImage(entity.getRestaurantImage())
                    .build();
            dtoList.add(dto);
        }
        return dtoList;
    }

    public int write(RestaurantDTO restaurantDTO) {
        MemberEntity memberEntity = memberRepository.findById(restaurantDTO.getMemberId())
                .orElseThrow(()
                        -> new EntityNotFoundException("회원정보가 없습니다."));
        RestaurantEntity restaurantEntity = RestaurantEntity.builder()
                .member(memberEntity)
                .restaurantName(restaurantDTO.getRestaurantName())
                .restaurantTitle(restaurantDTO.getRestaurantTitle())
                .restaurantContent(restaurantDTO.getRestaurantContent())
                .restaurantImage(restaurantDTO.getRestaurantImage())
                .restaurantRating(restaurantDTO.getRestaurantRating())
                .build();

        restaurantRepository.save(restaurantEntity);

        return restaurantEntity.getRestaurantId();
    }

}
