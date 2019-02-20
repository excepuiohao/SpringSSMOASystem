package com.service.impl;

import java.util.List;

import com.bean.Car;
import com.dao.CarDAO;
import com.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarDAO carDAO;

	@Override
	public void InsertCar(Car car) {
		// TODO Auto-generated method stub
		carDAO.InsertCar(car);
	}

	@Override
	public void UpdateCar(Car car) {
		// TODO Auto-generated method stub
		carDAO.UpdateCar(car);
	}

	@Override
	public void DeleteCar(String carId) {
		// TODO Auto-generated method stub
		carDAO.DeleteCar(carId);
	}

	@Override
	public List<Car> SelectCar() {
		// TODO Auto-generated method stub
		return carDAO.SelectCar();
	}

	@Override
	public Car SelectCarById(String carId) {
		// TODO Auto-generated method stub
		return carDAO.SelectCarById(carId);
	}

}
