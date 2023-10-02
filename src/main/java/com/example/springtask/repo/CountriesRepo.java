package com.example.springtask.repo;


import com.example.springtask.entity.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountriesRepo extends JpaRepository<CountriesEntity, Integer> {
 //   List<CountriesEntity> findAllByCountryId();
}
