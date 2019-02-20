package com.dao;

import java.util.List;

import com.bean.Apartment;;

public interface ApartmentDAO {

	void InsertApartment(Apartment apartment);

	void UpdateApartment(Apartment apartment);

	void DeleteApartment(String apartmentId);

	Apartment SelectApartmentById(String apartmentId);

	List<Apartment> SelectAllApartment();
}
