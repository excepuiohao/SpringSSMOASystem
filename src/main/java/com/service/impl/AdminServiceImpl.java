package com.service.impl;

import com.bean.Admin;
import com.dao.AdminDAO;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO adminDAO;

	@Override
	public void InsertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDAO.InsertAdmin(admin);

	}

	@Override
	public void UpdateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDAO.UpdateAdmin(admin);
	}

	@Override
	public void DeleteAdmin(String adminId) {
		// TODO Auto-generated method stub
		adminDAO.DeleteAdmin(adminId);
	}

	@Override
	public Admin SelectAdminById(String adminId) {
		// TODO Auto-generated method stub
		return adminDAO.SelectAdminById(adminId);
	}

	@Override
	public Admin SelectAdminByIdAndPassword(String adminId, String passwpord) {
		// TODO Auto-generated method stub
		return adminDAO.SelectAdminByIdAndPassword(adminId, passwpord);
	}

}
