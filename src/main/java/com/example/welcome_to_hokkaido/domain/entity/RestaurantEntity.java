package com.example.welcome_to_hokkaido.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
@Table(name = "restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @Column(name = "restaurant_content")
    private String restaurantContent;

    @Column(name = "restaurant_title")
    private String restaurantTitle;

    @Column(name = "restaurant_rating")
    private int restaurantRating;

    @CreatedDate
    @Column(name = "restaurant_date",
            columnDefinition = "timestamp default current_timestamp")
    LocalDateTime restaurantDate;

    @Column(name = "restaurant_image_url")
    private String restaurantImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    MemberEntity member;
}
