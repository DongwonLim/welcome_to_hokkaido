package com.example.welcome_to_hokkaido.controller;

import com.example.welcome_to_hokkaido.service.RestaurantService;
import lombok.RequiredArgsConstructor;
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

}
