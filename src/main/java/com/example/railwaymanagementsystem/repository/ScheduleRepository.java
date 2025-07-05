package com.example.railwaymanagementsystem.repository;

import com.example.railwaymanagementsystem.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}
