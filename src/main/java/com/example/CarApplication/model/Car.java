package com.example.CarApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "car")
public class Car {
    @Id
    private int id;
    private String brand;
    private String modelname;
    private String modelyear;
}
