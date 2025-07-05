package com.example.railwaymanagementsystem.controller;

import com.example.railwaymanagementsystem.entity.Schedule;

import com.example.railwaymanagementsystem.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedule/add/")
    public void addSchedule(@RequestBody Schedule schedule){

        scheduleService.addSchedule(schedule);
    }

    @GetMapping("/schedule/get")
    public List<Schedule> getSchedules(){
        return scheduleService.getSchedules();
    }
    @PutMapping("/schedule/update/{id}")
    public void updateSchedule(@PathVariable int id,@RequestBody Schedule schedule){

        scheduleService.updateSchedules(id,schedule);
    }
    @DeleteMapping("/schedule/delete/{id}")
    public void deleteSchedule(@PathVariable int id){

        scheduleService.deleteSchedule(id);
    }

}




