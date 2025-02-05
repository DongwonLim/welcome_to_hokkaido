package com.example.welcome_to_hokkaido.controller;

import com.example.welcome_to_hokkaido.domain.dto.RestaurantDTO;
import com.example.welcome_to_hokkaido.security.MemberUserDetails;
import com.example.welcome_to_hokkaido.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("restaurant")
@Controller
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("list")
    public String list() {
        return "restaurant/list";
    }

    @GetMapping
    public String write() {
        return "restaurant/write";
    }

    public String write(RestaurantDTO restaurant,
                        @AuthenticationPrincipal MemberUserDetails user) {

        restaurant.setMemberId(user.getUsername());
        int restaurantId = restaurantService.write(restaurant);

        return "redirect:/restaurant/list";
    }

}
