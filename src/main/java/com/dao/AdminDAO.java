package com.dao;

import com.bean.Admin;

public interface AdminDAO {

	void InsertAdmin(Admin admin);

	void UpdateAdmin(Admin admin);

	void DeleteAdmin(String adminId);

	Admin SelectAdminById(String adminId);
	
	Admin SelectAdminByIdAndPassword(String adminId,String passwpord);
}
