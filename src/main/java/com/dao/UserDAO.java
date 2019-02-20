package com.dao;

import java.util.List;

import com.bean.Users;

public interface UserDAO {

	void InsertUser(Users users);

	void UpdateUser(Users users);

	void DeleteUser(String userId);

	Users SelectUserByUserID(String userId);

	Users SelectUserByIdAndPassword(Users users);

	int SelectUserLevelByUserID(String userId);
	
	List<String> SelectAllUserId();
	
}
