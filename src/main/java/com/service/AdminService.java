package com.service;

import com.bean.Admin;

public interface AdminService {
	void InsertAdmin(Admin admin);

	void UpdateAdmin(Admin admin);

	void DeleteAdmin(String adminId);

	Admin SelectAdminById(String adminId);
	Admin SelectAdminByIdAndPassword(String adminId,String passwpord);
}
