package com.bean;

public class ProjectUser {

	private int ProjectUserId;

	private int ProjectId;

	private int UserId;

	private String ProjectProcess;

	public int getProjectUserId() {
		return ProjectUserId;
	}

	public void setProjectUserId(int projectUserId) {
		ProjectUserId = projectUserId;
	}

	public int getProjectId() {
		return ProjectId;
	}

	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getProjectProcess() {
		return ProjectProcess;
	}

	public void setProjectProcess(String projectProcess) {
		ProjectProcess = projectProcess;
	}

	public ProjectUser(int projectUserId, int projectId, int userId, String projectProcess) {
		super();
		ProjectUserId = projectUserId;
		ProjectId = projectId;
		UserId = userId;
		ProjectProcess = projectProcess;
	}

	public ProjectUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProjectUser [ProjectUserId=" + ProjectUserId + ", ProjectId=" + ProjectId + ", UserId=" + UserId
				+ ", ProjectProcess=" + ProjectProcess + "]";
	}

}
