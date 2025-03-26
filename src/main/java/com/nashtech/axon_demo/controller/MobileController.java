package com.nashtech.axon_demo.controller;


import com.nashtech.axon_demo.query.FindAllMobilesQuery;
import lombok.RequiredArgsConstructor;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/mobiles")
@RequiredArgsConstructor
public class MobileController {

    private final QueryGateway queryGateway;

    @GetMapping
    public CompletableFuture<List> getAllMobiles() {
        return queryGateway.query(new FindAllMobilesQuery(), List.class);
    }
}
