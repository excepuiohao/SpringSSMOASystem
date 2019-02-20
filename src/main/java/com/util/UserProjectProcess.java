package com.util;

public class UserProjectProcess {

	private int ProjectId;

	private String ProjectName;

	private String ProjectContent;

	private String ProjectTime;

	private float ProjectMoney;

	private int ProjectPMId;

	private String ProjectProcess;
	
	public int getProjectId() {
		return ProjectId;
	}

	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getProjectContent() {
		return ProjectContent;
	}

	public void setProjectContent(String projectContent) {
		ProjectContent = projectContent;
	}

	public String getProjectTime() {
		return ProjectTime;
	}

	public void setProjectTime(String projectTime) {
		ProjectTime = projectTime;
	}

	public float getProjectMoney() {
		return ProjectMoney;
	}

	public void setProjectMoney(float projectMoney) {
		ProjectMoney = projectMoney;
	}

	public int getProjectPMId() {
		return ProjectPMId;
	}

	public void setProjectPMId(int projectPMId) {
		ProjectPMId = projectPMId;
	}

	public String getProjectProcess() {
		return ProjectProcess;
	}

	public void setProjectProcess(String projectProcess) {
		ProjectProcess = projectProcess;
	}

	public UserProjectProcess(int projectId, String projectName, String projectContent, String projectTime,
			float projectMoney, int projectPMId, String projectProcess) {
		super();
		ProjectId = projectId;
		ProjectName = projectName;
		ProjectContent = projectContent;
		ProjectTime = projectTime;
		ProjectMoney = projectMoney;
		ProjectPMId = projectPMId;
		ProjectProcess = projectProcess;
	}

	public UserProjectProcess() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserProjectProcess [ProjectId=" + ProjectId + ", ProjectName=" + ProjectName + ", ProjectContent="
				+ ProjectContent + ", ProjectTime=" + ProjectTime + ", ProjectMoney=" + ProjectMoney + ", ProjectPMId="
				+ ProjectPMId + ", ProjectProcess=" + ProjectProcess + "]";
	}
	
}
