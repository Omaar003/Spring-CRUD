package com.example.springtask.controller;

import com.example.springtask.entity.CountriesEntity;
import com.example.springtask.entity.EmployeesEntity;
import com.example.springtask.entity.PatientsEntity;
import com.example.springtask.service.AppSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Qualifier
@RestController
@RequestMapping("/home")
public class AppController {
    @Autowired
    AppSerivce appSerivce;

    @GetMapping("/name")
    public String getName(){
        return appSerivce.getName();
    }

@GetMapping("/co")
    public List<CountriesEntity> getCountries()
{
    return appSerivce.getAllCountries();
}
    @GetMapping("/emp")
    public List<EmployeesEntity> getEmp()
    {return appSerivce.getAllEmployees();}

    @GetMapping("/pt")
    public List<PatientsEntity> getPat()
    {
        return appSerivce.getAllPatients();
    }

    @PostMapping("/create/user")
    public ResponseEntity addUser(@RequestBody PatientsEntity patientsEntity)
    {
        appSerivce.addUser(patientsEntity);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/user/name/{name}")
    public Optional<PatientsEntity> getUserByName(@PathVariable String name)
    {
        return appSerivce.getUserByName(name);
    }

    @PostMapping("/update/user")
    public ResponseEntity UpdateUser(@RequestBody PatientsEntity patientsEntity)
    {
        appSerivce.UpdateUser(patientsEntity);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/delete/user")
    public ResponseEntity DeleteUser(@RequestBody PatientsEntity patientsEntity)
    {
        appSerivce.DeleteUser(patientsEntity);
        return ResponseEntity.ok().build();
    }
}
