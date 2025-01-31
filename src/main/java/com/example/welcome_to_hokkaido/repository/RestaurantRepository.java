package com.example.welcome_to_hokkaido.repository;

import com.example.welcome_to_hokkaido.domain.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, String> {
}
