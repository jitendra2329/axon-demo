package com.nashtech.axon_demo.command;

//package com.example.axon_demo.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class UpdateMobileCommand {
    @TargetAggregateIdentifier
    private String id;
    private String brand;
    private String model;
    private double price;
}
