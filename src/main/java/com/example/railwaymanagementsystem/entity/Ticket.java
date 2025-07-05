package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookingDate;
    private String travelDate;
    private int totalFee;
    private String status;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="passenger_id")
    @JsonBackReference
    private Passenger passengers;



    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="train_id")
    @JsonBackReference
    private Train trainList;

}
