package com.example.welcome_to_hokkaido.controller;

import com.example.welcome_to_hokkaido.domain.dto.RestaurantDTO;
import com.example.welcome_to_hokkaido.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("restaurant")
@RestController
public class RestaurantRestController {

    private final RestaurantService restaurantService;

    @PostMapping("getList")
    public List<RestaurantDTO> getList() {
        return restaurantService.getList();
    }

}
