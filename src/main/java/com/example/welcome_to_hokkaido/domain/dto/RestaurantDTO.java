package com.example.welcome_to_hokkaido.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantDTO {

    String memberId;
    int restaurantId;
    String restaurantTitle;
    String restaurantContent;
    LocalDateTime restaurantDate;
    String restaurantImage;
    int restaurantRating;
    String restaurantName;

}
