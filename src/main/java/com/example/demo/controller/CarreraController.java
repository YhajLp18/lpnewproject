package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarreraEntity;
import com.example.demo.serviceImpl.CarreraServiceImpl;

@CrossOrigin
@RestController
@RequestMapping({"/carrera"})
public class CarreraController {
    @Autowired
    CarreraServiceImpl service;
    
    @GetMapping
    public List<CarreraEntity>listar(){
        return service.readAll();
    }
    
    @GetMapping(path = "/{id}")
    public CarreraEntity listarId(@PathVariable("id") Long id){
        return service.read(id);
    }
    
    @PostMapping("/new")
    public CarreraEntity save(@RequestBody CarreraEntity entity){
        return service.create(entity);
    }
    
    @PutMapping("/update/{id}")
    public CarreraEntity editar(@PathVariable("id") Long id, @RequestBody CarreraEntity entity){
        return service.update(entity);
    }
    
    @DeleteMapping(path = {"/{id}"})
    public void eliminar(@PathVariable("id") Long id){
        service.delete(id);
    }
}