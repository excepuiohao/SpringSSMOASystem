package com.service;

import java.util.List;

import com.bean.Apartment;

public interface ApartmentService {
	void InsertApartment(Apartment apartment);

	void UpdateApartment(Apartment apartment);

	void DeleteApartment(String apartmentId);

	Apartment SelectApartmentById(String apartmentId);

	List<Apartment> SelectAllApartment();
}
