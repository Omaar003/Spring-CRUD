package com.example.springtask.repo;

import com.example.springtask.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepo extends JpaRepository<EmployeesEntity,Integer> {
}
