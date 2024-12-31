package com.example.CarApplication.service;

import com.example.CarApplication.model.Car;
import com.example.CarApplication.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;


    public List<Car> findCarsByModelyear(String modelyear) {
        return carRepository.findByModelyear(modelyear);
    }

    public List<Car> addCars(List<Car> cars) {
        return carRepository.saveAll(cars);
    }

    public List<Car> findCarsByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }
}
