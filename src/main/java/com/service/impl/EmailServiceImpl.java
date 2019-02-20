package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Email;
import com.dao.EmailDAO;
import com.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailDAO emailDAO;

	@Override
	public void InsertEmail(Email email) {
		// TODO Auto-generated method stub
		emailDAO.InsertEmail(email);
	}

	@Override
	public void UpdateEmail(Email email) {
		// TODO Auto-generated method stub
		emailDAO.UpdateEmail(email);
	}

	@Override
	public void DeleteEmail(String emailId) {
		// TODO Auto-generated method stub
		emailDAO.DeleteEmail(emailId);
	}

	@Override
	public Email SelectEmailById(String emailId) {
		// TODO Auto-generated method stub
		return emailDAO.SelectEmailById(emailId);
	}

}
