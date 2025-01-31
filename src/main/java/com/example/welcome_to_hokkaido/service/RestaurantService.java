package com.example.welcome_to_hokkaido.service;

import com.example.welcome_to_hokkaido.domain.dto.RestaurantDTO;
import com.example.welcome_to_hokkaido.domain.entity.RestaurantEntity;
import com.example.welcome_to_hokkaido.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

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

}
