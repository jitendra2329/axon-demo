package com.nashtech.axon_demo.projection;


import com.nashtech.axon_demo.query.FindAllMobilesQuery;
import com.nashtech.axon_demo.repository.MobileRepository;
import lombok.RequiredArgsConstructor;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MobileProjection {

    private final MobileRepository repository;

    @QueryHandler
    public List<MobileEntity> handle(FindAllMobilesQuery query) {
        return repository.findAll();
    }
}
