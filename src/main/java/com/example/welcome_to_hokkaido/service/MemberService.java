package com.example.welcome_to_hokkaido.service;

import com.example.welcome_to_hokkaido.domain.dto.MemberDTO;
import com.example.welcome_to_hokkaido.domain.entity.MemberEntity;
import com.example.welcome_to_hokkaido.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final BCryptPasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;

    public void join(MemberDTO dto) {
        MemberEntity entity = MemberEntity.builder()
                .memberId(dto.getMemberId())
                .memberPw(passwordEncoder.encode(dto.getMemberPw()))
                .memberName(dto.getMemberName())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .gender(dto.getGender())
                .phone(dto.getPhone())
                .build();

        memberRepository.save(entity);
    }
}
