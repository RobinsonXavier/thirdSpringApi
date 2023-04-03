package com.exerciciospring3.modelaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exerciciospring3.modelaapi.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
  
}
