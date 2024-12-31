package com.example.CarApplication.controller;

import com.example.CarApplication.model.Car;
import com.example.CarApplication.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class Carcontroller {
    @Autowired
    private CarService carService;

    @GetMapping("/cars/by-model-year")
    public ResponseEntity<List<Car>> getCarsByModelyear(@RequestParam String modelyear) {
        List<Car> cars = carService.findCarsByModelyear(modelyear);
        return ResponseEntity.ok(cars);
    }

    @PostMapping("/addcars")
    public ResponseEntity<List<Car>> addCar(@RequestBody List<Car> cars) {
        try {
            List<Car> addedCars = carService.addCars(cars);
            return ResponseEntity.ok(addedCars); // Return the successfully added cars
        } catch (Exception e) {
            // Handle exceptions and return a proper error response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null); // Or you can return an appropriate error message
        }
    }

    @GetMapping("/cars/by-brand")
        public ResponseEntity<List<Car>> getCarsByBrand(@RequestParam String brand) {
            List<Car> cars = carService.findCarsByBrand(brand);
            return ResponseEntity.ok(cars);
        }

    }




