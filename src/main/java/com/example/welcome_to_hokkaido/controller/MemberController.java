package com.example.welcome_to_hokkaido.controller;

import com.example.welcome_to_hokkaido.domain.dto.MemberDTO;
import com.example.welcome_to_hokkaido.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("loginForm")
    public String loginForm() {
        return "member/loginForm";
    }

    @GetMapping("join")
    public String join() {
        return "member/joinForm";
    }

    @PostMapping("join")
    public String join(MemberDTO memberDTO) {
        memberService.join(memberDTO);
        return "redirect:/member/loginForm";
    }

    @PostMapping("login")
    public String login(MemberDTO memberDto) {
        return "redirect:/";
    }
}
