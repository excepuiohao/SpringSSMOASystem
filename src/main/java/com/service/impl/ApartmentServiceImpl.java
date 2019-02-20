package com.service.impl;

import com.bean.Apartment;
import com.dao.ApartmentDAO;
import com.service.ApartmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentServiceImpl implements ApartmentService {

	@Autowired
	ApartmentDAO apartmentDAO;

	@Override
	public void InsertApartment(Apartment apartment) {
		// TODO Auto-generated method stub
		apartmentDAO.InsertApartment(apartment);
	}

	@Override
	public void UpdateApartment(Apartment apartment) {
		// TODO Auto-generated method stub
		apartmentDAO.UpdateApartment(apartment);

	}

	@Override
	public void DeleteApartment(String apartmentId) {
		// TODO Auto-generated method stub
		apartmentDAO.DeleteApartment(apartmentId);
	}

	@Override
	public Apartment SelectApartmentById(String apartmentId) {
		// TODO Auto-generated method stub
		return apartmentDAO.SelectApartmentById(apartmentId);
	}

	@Override
	public List<Apartment> SelectAllApartment() {
		// TODO Auto-generated method stub
		return apartmentDAO.SelectAllApartment();
	}

}
