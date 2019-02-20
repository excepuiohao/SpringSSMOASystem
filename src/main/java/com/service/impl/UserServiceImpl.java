package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Users;
import com.dao.UserDAO;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	public void InsertUser(Users users) {
		// TODO Auto-generated method stub
		userDAO.InsertUser(users);
	}

	@Override
	public void UpdateUser(Users users) {
		// TODO Auto-generated method stub
		userDAO.UpdateUser(users);
	}

	@Override
	public void DeleteUser(String userId) {
		// TODO Auto-generated method stub
		userDAO.DeleteUser(userId);
	}

	@Override
	public Users SelectUserByUserID(String userId) {
		// TODO Auto-generated method stub
		return userDAO.SelectUserByUserID(userId);
	}

	@Override
	public Users SelectUserByIdAndPassword(Users users) {
		// TODO Auto-generated method stub
		return userDAO.SelectUserByIdAndPassword(users);
	}

	@Override
	public int SelectUserLevelByUserID(String userId) {
		// TODO Auto-generated method stub
		return userDAO.SelectUserLevelByUserID(userId);
	}

	@Override
	public List<String> SelectAllUserId() {
		// TODO Auto-generated method stub
		return userDAO.SelectAllUserId();
	}

}
