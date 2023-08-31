package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CarreraEntity;

public interface CarreraService{
	CarreraEntity create(CarreraEntity entity);
	CarreraEntity update(CarreraEntity entity);
	void delete(Long id);
	CarreraEntity read(Long id);
	List<CarreraEntity> readAll();

}
