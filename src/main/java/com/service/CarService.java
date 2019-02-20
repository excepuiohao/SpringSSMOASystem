package com.service;

import java.util.List;

import com.bean.Car;

public interface CarService {
	void InsertCar(Car car);

	void UpdateCar(Car car);

	void DeleteCar(String carId);

	List<Car> SelectCar();

	Car SelectCarById(String carId);
}
