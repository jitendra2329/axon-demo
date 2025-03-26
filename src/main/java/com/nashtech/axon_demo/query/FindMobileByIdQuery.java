package com.nashtech.axon_demo.query;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindMobileByIdQuery {
    private String id;
}
