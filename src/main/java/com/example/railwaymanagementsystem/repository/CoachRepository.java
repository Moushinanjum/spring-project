package com.example.railwaymanagementsystem.repository;

import com.example.railwaymanagementsystem.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository<Coach, Integer> {
}
