package com.example.railwaymanagementsystem.repository;

import com.example.railwaymanagementsystem.entity.Ticket;
import com.example.railwaymanagementsystem.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Integer> {
}
