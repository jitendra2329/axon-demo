package com.nashtech.axon_demo.event;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MobileCreatedEvent {
    private String id;
    private String brand;
    private String model;
    private double price;
}
