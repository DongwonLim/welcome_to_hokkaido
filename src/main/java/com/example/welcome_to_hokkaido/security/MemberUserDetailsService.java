package com.example.welcome_to_hokkaido.security;

import com.example.welcome_to_hokkaido.domain.entity.MemberEntity;
import com.example.welcome_to_hokkaido.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        MemberEntity memberEntity = memberRepository.findById(id)
                .orElseThrow(() ->
                        new UsernameNotFoundException(id + " : 없는 id입니다."));

        MemberUserDetails user = MemberUserDetails.builder()
                .id(memberEntity.getMemberId())
                .password(memberEntity.getMemberPw())
                .name(memberEntity.getMemberName())
                .address(memberEntity.getAddress())
                .email(memberEntity.getEmail())
                .gender(memberEntity.getGender().toString())
                .phone(memberEntity.getPhone())
                .build();

        return user;
    }
}
