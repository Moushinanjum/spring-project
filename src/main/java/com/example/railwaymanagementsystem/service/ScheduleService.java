package com.example.railwaymanagementsystem.service;

import com.example.railwaymanagementsystem.entity.Schedule;


import com.example.railwaymanagementsystem.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public void addSchedule(Schedule schedule) {
        Schedule schedule1 = new Schedule();
        schedule1.setId(schedule.getId());
        schedule1.setArrivalTime(schedule.getArrivalTime());
        schedule1.setDepartureTime(schedule.getDepartureTime());
        schedule1.setNumber(schedule.getNumber());

        scheduleRepository.save(schedule1);
    }

    public List<Schedule> getSchedules() {
        return scheduleRepository.findAll();
    }
    public void updateSchedules(int id,Schedule schedule){
        Schedule schedule2=scheduleRepository.findById(id).get();
        schedule2.setArrivalTime(schedule.getArrivalTime());
        schedule2.setDepartureTime(schedule.getDepartureTime());

        scheduleRepository.save(schedule2);
    }

    public void deleteSchedule(int id){
        Schedule schedule3=scheduleRepository.findById(id).get();
        scheduleRepository.save(schedule3);
    }
}
