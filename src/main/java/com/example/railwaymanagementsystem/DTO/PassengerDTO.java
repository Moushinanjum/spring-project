package com.example.railwaymanagementsystem.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PassengerDTO {
    private String name;
    private String gender ;
    private int age;
    private String address;
    private String phoneNumber;
}
