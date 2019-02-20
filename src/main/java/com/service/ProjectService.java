
package com.service;

import java.util.List;

import com.bean.Project;

public interface ProjectService {
	void InsertProject(Project project);

	void UpdateProject(Project project);

	void DeleteProject(String projectId);

	List<Project> SelectProjectByProjectPMId(String projectPMId);

	Project SelectProjectByProjectId(String ProjectId);

	List<Project> SelectAllProject();
}
