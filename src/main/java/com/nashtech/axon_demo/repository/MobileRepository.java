package com.nashtech.axon_demo.repository;

//package com.example.axon_demo.repository;

import com.nashtech.axon_demo.projection.MobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<MobileEntity, String> {
}
