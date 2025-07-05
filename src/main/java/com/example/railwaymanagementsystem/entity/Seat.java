package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    private String type;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="coach_id")
    @JsonBackReference
    private Coach coach;



}
