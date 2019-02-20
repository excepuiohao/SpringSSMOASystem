package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Project;
import com.dao.ProjectDAO;
import com.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDAO projectDAO;

	@Override
	public void InsertProject(Project project) {
		// TODO Auto-generated method stub
		projectDAO.InsertProject(project);
	}

	@Override
	public void UpdateProject(Project project) {
		// TODO Auto-generated method stub
		projectDAO.UpdateProject(project);
	}

	@Override
	public void DeleteProject(String projectId) {
		// TODO Auto-generated method stub
		projectDAO.DeleteProject(projectId);
	}

	@Override
	public List<Project> SelectProjectByProjectPMId(String projectPMId) {
		// TODO Auto-generated method stub
		return projectDAO.SelectProjectByProjectPMId(projectPMId);
	}

	@Override
	public List<Project> SelectAllProject() {
		// TODO Auto-generated method stub
		return projectDAO.SelectAllProject();
	}

	@Override
	public Project SelectProjectByProjectId(String ProjectId) {
		// TODO Auto-generated method stub
		return projectDAO.SelectProjectByProjectId(ProjectId);
	}

}
