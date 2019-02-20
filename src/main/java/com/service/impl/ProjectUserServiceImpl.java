package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ProjectUser;
import com.dao.ProjectUserDAO;
import com.service.ProjectUserService;
import com.util.UserProjectProcess;

@Service
public class ProjectUserServiceImpl implements ProjectUserService {
	@Autowired
	ProjectUserDAO projectUserDAO;

	@Override
	public void InsertProjectUser(ProjectUser projectUser) {
		// TODO Auto-generated method stub
		projectUserDAO.InsertProjectUser(projectUser);

	}

	@Override
	public List<String> SelectUserIDByProjectId(String ProjectId) {
		// TODO Auto-generated method stub
		return projectUserDAO.SelectUserIDByProjectId(ProjectId);
	}

	@Override
	public List<String> SelectProjectIDByUserId(String UserId) {
		// TODO Auto-generated method stub
		return projectUserDAO.SelectProjectIDByUserId(UserId);
	}

	@Override
	public void DeleteProjectUser(String ProjectId, String UserId) {
		// TODO Auto-generated method stub
		projectUserDAO.DeleteProjectUser(ProjectId, UserId);
	}

	@Override
	public void UpdateProjectUser(ProjectUser projectUser) {
		// TODO Auto-generated method stub
		projectUserDAO.UpdateProjectUser(projectUser);
	}

	@Override
	public List<UserProjectProcess> SelectUserProjectProcessByUserId(String UserId) {
		// TODO Auto-generated method stub
		return projectUserDAO.SelectUserProjectProcessByUserId(UserId);
	}

}
