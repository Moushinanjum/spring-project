package com.example.railwaymanagementsystem.repository;

import com.example.railwaymanagementsystem.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}
