package com.nashtech.axon_demo.command;

//package com.example.axon_demo.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class DeleteMobileCommand {
    @TargetAggregateIdentifier
    private String id;
}
