package com.bean;

/**
 * @author excepuio Ìóƒøª˘Óê
 */
public class Project {
	private int ProjectId;

	private String ProjectName;

	private String ProjectContent;

	private String ProjectTime;

	private float ProjectMoney;

	private int ProjectPMId;

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

	public Project(int projectId, String projectName, String projectContent, String projectTime, float projectMoney,
			int projectPMId) {
		super();
		ProjectId = projectId;
		ProjectName = projectName;
		ProjectContent = projectContent;
		ProjectTime = projectTime;
		ProjectMoney = projectMoney;
		ProjectPMId = projectPMId;
	}

	@Override
	public String toString() {
		return "Project [ProjectId=" + ProjectId + ", ProjectName=" + ProjectName + ", ProjectContent=" + ProjectContent
				+ ", ProjectTime=" + ProjectTime + ", ProjectMoney=" + ProjectMoney + ", ProjectPMId=" + ProjectPMId
				+ ", getProjectId()=" + getProjectId() + ", getProjectName()=" + getProjectName()
				+ ", getProjectContent()=" + getProjectContent() + ", getProjectTime()=" + getProjectTime()
				+ ", getProjectMoney()=" + getProjectMoney() + ", getProjectPMId()=" + getProjectPMId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
