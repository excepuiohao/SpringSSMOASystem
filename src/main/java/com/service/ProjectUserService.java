package com.service;

import java.util.List;

import com.bean.ProjectUser;
import com.util.UserProjectProcess;

public interface ProjectUserService {

	void InsertProjectUser(ProjectUser projectUser);

	void DeleteProjectUser(String ProjectId, String UserId);

	void UpdateProjectUser(ProjectUser projectUser);

	List<String> SelectUserIDByProjectId(String ProjectId);

	List<String> SelectProjectIDByUserId(String UserId);
	
	List<UserProjectProcess> SelectUserProjectProcessByUserId(String UserId);
}
