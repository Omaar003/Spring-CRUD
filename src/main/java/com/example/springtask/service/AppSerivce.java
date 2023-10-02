package com.example.springtask.service;

import com.example.springtask.entity.CountriesEntity;
import com.example.springtask.entity.EmployeesEntity;
import com.example.springtask.entity.PatientsEntity;
import com.example.springtask.repo.CountriesRepo;
import com.example.springtask.repo.EmployeesRepo;
import com.example.springtask.repo.PatientsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class AppSerivce {

    @Autowired
    CountriesRepo countriesRepo;

    @Autowired
    EmployeesRepo employeesRepo;

    @Autowired
    PatientsRepo patientsRepo;

    public String getName() {
        return "Omaaaaaaaaar";
    }

   // @PostConstruct
    public List<CountriesEntity> getAllCountries()
    {
        return countriesRepo.findAll();
    }

    //R
    public List<EmployeesEntity> getAllEmployees()
    {
        return employeesRepo.findAll();
    }
    public List<PatientsEntity> getAllPatients()
    {
        return patientsRepo.findAll();
    }
//Create
    public void addUser(PatientsEntity patientsEntity){
        patientsRepo.save(patientsEntity);
    }

    public Optional<PatientsEntity> getUserByName(String name)
    {
        return patientsRepo.findAllByFirstname(name);
    }


    public void UpdateUser(PatientsEntity patientsEntity){
        patientsRepo.save(patientsEntity);
    }

    public void DeleteUser(PatientsEntity patientsEntity){
        patientsRepo.delete(patientsEntity);
    }
}
