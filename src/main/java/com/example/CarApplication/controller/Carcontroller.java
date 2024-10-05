package com.example.CarApplication.controller;

import com.example.CarApplication.model.Car;
import com.example.CarApplication.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class Carcontroller {
    @Autowired
    private CarService carService;

    @GetMapping("/available")
    public ResponseEntity<List<Car>> getAvailableCars() {
        List<Car> availableCars = carService.findAvailableCars();
        return ResponseEntity.ok(availableCars);
      }

    }


