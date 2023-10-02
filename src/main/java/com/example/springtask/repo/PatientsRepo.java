package com.example.springtask.repo;

import com.example.springtask.entity.PatientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface PatientsRepo extends JpaRepository<PatientsEntity, BigInteger> {

    Optional<PatientsEntity> findAllByFirstname(String name);
}
