package com.dao;

import java.util.List;

import com.bean.EmailPasswordConfirm;

public interface EmailPasswordDAO {

	void InsertEmailPasswordConfirm(EmailPasswordConfirm adjustSalary);

	void UpdateEmailPasswordConfirm(EmailPasswordConfirm adjustSalary);

	List<EmailPasswordConfirm> SelectEmailPasswordConfirmByStatus(String status);

	EmailPasswordConfirm SelectEmailPasswordConfirmByUserId(String UserId);

}
