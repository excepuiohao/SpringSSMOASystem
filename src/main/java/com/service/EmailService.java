package com.service;

import com.bean.Email;

public interface EmailService {
	void InsertEmail(Email email);

	void UpdateEmail(Email email);

	void DeleteEmail(String emailId);

	Email SelectEmailById(String emailId);
}
