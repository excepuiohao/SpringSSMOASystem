package com.dao;

import com.bean.Email;

public interface EmailDAO {

	void InsertEmail(Email email);

	void UpdateEmail(Email email);

	void DeleteEmail(String emailId);

	Email SelectEmailById(String emailId);
}
