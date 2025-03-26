package com.nashtech.axon_demo.projection;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MobileEntity {
    @Id
    private String id;
    private String brand;
    private String model;
    private double price;
}
