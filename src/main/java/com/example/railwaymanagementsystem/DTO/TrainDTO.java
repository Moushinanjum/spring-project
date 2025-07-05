package com.example.railwaymanagementsystem.DTO;

import lombok.Data;

@Data
public class TrainDTO {
    private String name;
    private String type;
    private int total_coaches;
    private int capacity;
    private String operatorName;
}
