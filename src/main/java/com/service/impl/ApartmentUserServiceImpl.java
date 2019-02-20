package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ApartmentUser;
import com.dao.ApartmentUserDAO;
import com.service.ApartmentUserService;

@Service
public class ApartmentUserServiceImpl implements ApartmentUserService {

	@Autowired
	ApartmentUserDAO apartmentUserDAO;

	@Override
	public void InsertApartmentUser(ApartmentUser apartmentUser) {
		// TODO Auto-generated method stub
		apartmentUserDAO.InsertApartmentUser(apartmentUser);
	}

	@Override
	public void DeleteApartmentUser(ApartmentUser apartmentUser) {
		// TODO Auto-generated method stub
		apartmentUserDAO.DeleteApartmentUser(apartmentUser);
	}

}
