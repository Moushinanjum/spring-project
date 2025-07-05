package com.example.railwaymanagementsystem.repository;

import com.example.railwaymanagementsystem.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
