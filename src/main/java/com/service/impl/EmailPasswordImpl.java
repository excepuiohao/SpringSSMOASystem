package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.EmailPasswordConfirm;
import com.dao.EmailPasswordDAO;
import com.service.EmailPasswordService;

@Service
public class EmailPasswordImpl implements EmailPasswordService {

	@Autowired
	EmailPasswordDAO emailpasswordDAO;

	@Override
	public void InsertEmailPasswordConfirm(EmailPasswordConfirm adjustSalary) {
		// TODO Auto-generated method stub
		emailpasswordDAO.InsertEmailPasswordConfirm(adjustSalary);
	}

	@Override
	public void UpdateEmailPasswordConfirm(EmailPasswordConfirm adjustSalary) {
		// TODO Auto-generated method stub
		emailpasswordDAO.UpdateEmailPasswordConfirm(adjustSalary);

	}

	@Override
	public List<EmailPasswordConfirm> SelectEmailPasswordConfirmByStatus(String status) {
		// TODO Auto-generated method stub
		return emailpasswordDAO.SelectEmailPasswordConfirmByStatus(status);
	}

	@Override
	public EmailPasswordConfirm SelectEmailPasswordConfirmByUserId(String UserId) {
		// TODO Auto-generated method stub
		return emailpasswordDAO.SelectEmailPasswordConfirmByUserId(UserId);
	}

}
