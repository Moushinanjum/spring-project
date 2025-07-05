package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender ;
    private int age;
    private String address;
    private String phoneNumber;

    @OneToMany(mappedBy = "passengers",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Ticket> tickets;

}
