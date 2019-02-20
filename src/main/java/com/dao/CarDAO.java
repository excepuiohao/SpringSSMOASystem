package com.dao;

import java.util.List;

import com.bean.Car;

public interface CarDAO {

	void InsertCar(Car car);

	void UpdateCar(Car car);

	void DeleteCar(String carId);

	List<Car> SelectCar();

	Car SelectCarById(String carId);
}
