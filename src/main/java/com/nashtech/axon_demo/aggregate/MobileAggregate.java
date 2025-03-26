package com.nashtech.axon_demo.aggregate;
//package com.example.axon_demo.aggregate;

import com.nashtech.axon_demo.command.CreateMobileCommand;
import com.nashtech.axon_demo.command.UpdateMobileCommand;
import com.nashtech.axon_demo.command.DeleteMobileCommand;
import com.nashtech.axon_demo.event.MobileCreatedEvent;
import com.nashtech.axon_demo.event.MobileUpdatedEvent;
import com.nashtech.axon_demo.event.MobileDeletedEvent;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
@Data
@NoArgsConstructor
public class MobileAggregate {

    @AggregateIdentifier
    private String id;
    private String brand;
    private String model;
    private double price;

    @CommandHandler
    public MobileAggregate(CreateMobileCommand command) {
        apply(new MobileCreatedEvent(command.getId(), command.getBrand(), command.getModel(), command.getPrice()));
    }

    @EventSourcingHandler
    public void on(MobileCreatedEvent event) {
        this.id = event.getId();
        this.brand = event.getBrand();
        this.model = event.getModel();
        this.price = event.getPrice();
    }

    @CommandHandler
    public void handle(UpdateMobileCommand command) {
        apply(new MobileUpdatedEvent(command.getId(), command.getBrand(), command.getModel(), command.getPrice()));
    }

    @EventSourcingHandler
    public void on(MobileUpdatedEvent event) {
        this.brand = event.getBrand();
        this.model = event.getModel();
        this.price = event.getPrice();
    }

    @CommandHandler
    public void handle(DeleteMobileCommand command) {
        apply(new MobileDeletedEvent(command.getId(), this.brand, this.model, this.price));
    }

    @EventSourcingHandler
    public void on(MobileDeletedEvent event) {
        this.id = null;
        this.brand = null;
        this.model = null;
        this.price = 0;
    }
}
