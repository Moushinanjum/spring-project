package com.example.railwaymanagementsystem.repository;

import com.example.railwaymanagementsystem.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {
    Integer id(int id);
}
