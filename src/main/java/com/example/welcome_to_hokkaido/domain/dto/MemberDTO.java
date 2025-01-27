package com.example.welcome_to_hokkaido.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    String memberId;

    String memberPw;

    String memberName;

    String email;

    String address;

    String gender;

    String phone;
}
