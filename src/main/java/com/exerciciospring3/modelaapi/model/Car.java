package com.exerciciospring3.modelaapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 150, nullable = false, unique = true)
  private String modelo;

  @Column(length = 100, nullable = false)
  private String fabricante;

  @Column(length = 10, nullable = false)
  private String dataFabricacao;

  @Column(nullable = false)
  private Double valor;

  @Column(nullable = false)
  private int anoModelo;
}
