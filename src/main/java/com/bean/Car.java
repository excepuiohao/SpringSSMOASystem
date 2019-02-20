package com.bean;

public class Car {
	private int CarId;

	private String CarLine;

	private int DriverId;

	private int CarNumber;

	private String CarModel;

	private String CarTime;

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public String getCarLine() {
		return CarLine;
	}

	public void setCarLine(String carLine) {
		CarLine = carLine;
	}

	public int getDriverId() {
		return DriverId;
	}

	public void setDriverId(int driverId) {
		DriverId = driverId;
	}

	public int getCarNumber() {
		return CarNumber;
	}

	public void setCarNumber(int carNumber) {
		CarNumber = carNumber;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public String getCarTime() {
		return CarTime;
	}

	public void setCarTime(String carTime) {
		CarTime = carTime;
	}

	@Override
	public String toString() {
		return "Car [CarId=" + CarId + ", CarLine=" + CarLine + ", DriverId=" + DriverId + ", CarNumber=" + CarNumber
				+ ", CarModel=" + CarModel + ", CarTime=" + CarTime + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int carId, String carLine, int driverId, int carNumber, String carModel, String carTime) {
		super();
		CarId = carId;
		CarLine = carLine;
		DriverId = driverId;
		CarNumber = carNumber;
		CarModel = carModel;
		CarTime = carTime;
	}

}
