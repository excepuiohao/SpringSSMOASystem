package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Car;
import com.bean.Project;
import com.bean.ProjectUser;
import com.service.ProjectService;
import com.service.ProjectUserService;
import com.service.impl.ProjectServiceImpl;
import com.service.impl.ProjectUserServiceImpl;
import com.util.UserProjectProcess;

@Controller
@RequestMapping(value = "/jsp")
public class ProjectController {

	@Resource(name = "projectServiceImpl", type = ProjectServiceImpl.class)
	ProjectService projectService;

	@Resource(name = "projectUserServiceImpl", type = ProjectUserServiceImpl.class)
	ProjectUserService projectUserService;

	@RequestMapping("/InsertProject")
	public String InsertProject(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ProjectPMId = Integer.valueOf(request.getParameter("ProjectPMId")).intValue();
		String ProjectName = request.getParameter("ProjectName");
		String ProjectContent = request.getParameter("ProjectContent");
		String ProjectTime = request.getParameter("ProjectTime");
		ProjectName = new String(ProjectName.getBytes("ISO-8859-1"), "UTF-8");
		ProjectContent = new String(ProjectContent.getBytes("ISO-8859-1"), "UTF-8");
		ProjectTime = new String(ProjectTime.getBytes("ISO-8859-1"), "UTF-8");
		float ProjectMoney = Float.valueOf(request.getParameter("ProjectMoney")).intValue();
		Project project = new Project(0, ProjectName, ProjectContent, ProjectTime, ProjectMoney, ProjectPMId);
		projectService.InsertProject(project);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('增加项目成功，返回首页');");
		out.println("</script>");
		List<Project> list = new ArrayList<Project>();
		list = projectService.SelectAllProject();
		request.setAttribute("list", list);
		return "../jsp/AllProject";

	}

	@RequestMapping("/SelectAllProject")
	public String SelectAllProject(HttpServletRequest request) throws IOException {
		List<Project> list = new ArrayList<Project>();
		list = projectService.SelectAllProject();
		request.setAttribute("list", list);
		return "../jsp/AllProject";

	}

	@RequestMapping("/DeleteProject")
	public String DeleteProject(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ProjectId = request.getParameter("ProjectId");
		projectService.DeleteProject(ProjectId);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除成功，返回首页');");
		out.println("</script>");
		List<Project> list = new ArrayList<Project>();
		list = projectService.SelectAllProject();
		request.setAttribute("list", list);
		return "../jsp/AllProject";

	}

	@RequestMapping("/UpdateProject1")
	public String UpdateProject1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ProjectId = request.getParameter("ProjectId");
		Project project = new Project();
		project = projectService.SelectProjectByProjectId(ProjectId);
		request.setAttribute("project", project);
		return "../jsp/UpdateProject";

	}

	@RequestMapping("/UpdateProject2")
	public String UpdateProject2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ProjectPMId = Integer.valueOf(request.getParameter("ProjectPMId")).intValue();
		String ProjectName = request.getParameter("ProjectName");
		String ProjectContent = request.getParameter("ProjectContent");
		String ProjectTime = request.getParameter("ProjectTime");
		ProjectName = new String(ProjectName.getBytes("ISO-8859-1"), "UTF-8");
		ProjectContent = new String(ProjectContent.getBytes("ISO-8859-1"), "UTF-8");
		ProjectTime = new String(ProjectTime.getBytes("ISO-8859-1"), "UTF-8");
		float ProjectMoney = Float.valueOf(request.getParameter("ProjectMoney")).intValue();
		int ProjectId = Integer.valueOf(request.getParameter("ProjectId")).intValue();
		Project project = new Project(ProjectId, ProjectName, ProjectContent, ProjectTime, ProjectMoney, ProjectPMId);
		projectService.UpdateProject(project);

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('更新成功，返回首页');");
		out.println("</script>");
		List<Project> list = new ArrayList<Project>();
		list = projectService.SelectAllProject();
		request.setAttribute("list", list);
		return "../jsp/AllProject";
	}
	
	
	
	@RequestMapping("/SelectMyProject")
	public String SelectMyProject(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userId = request.getSession().getAttribute("userId").toString();
		List<String> list= new ArrayList<String>();
		list=projectUserService.SelectProjectIDByUserId(userId);
		List<Project> list1= new ArrayList<Project>();
		Project project=new Project();
		for (int i = 0; i < list.size(); i++) {
			project=projectService.SelectProjectByProjectId(list.get(i));
			list1.add(project);
		}
		request.setAttribute("list", list1);
		return "../jsp/MyProject";
	}
	
	@RequestMapping("/UpdateProjectProcess")
	public String UpdateProjectProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ProjectId = Integer.valueOf(request.getParameter("ProjectId")).intValue();
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		String ProjectProcess = request.getParameter("ProjectProcess");
		ProjectProcess = new String(ProjectProcess.getBytes("ISO-8859-1"), "UTF-8");
		ProjectUser projectUser=new ProjectUser(0, ProjectId, userId, ProjectProcess);
		projectUserService.UpdateProjectUser(projectUser);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('更新成功，返回首页');");
		out.println("</script>");
		String userId1 = request.getSession().getAttribute("userId").toString();
		List<UserProjectProcess> list= new ArrayList<UserProjectProcess>();
		list=projectUserService.SelectUserProjectProcessByUserId(userId1);
		request.setAttribute("list", list);
		return "../jsp/MyProjectProcess";
	}
	
	@RequestMapping("/SelectMyProjectProcess")
	public String SelectMyProjectProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userId = request.getSession().getAttribute("userId").toString();
		List<UserProjectProcess> list= new ArrayList<UserProjectProcess>();
		list=projectUserService.SelectUserProjectProcessByUserId(userId);
		request.setAttribute("list", list);
		return "../jsp/MyProjectProcess";
	}
	
	@RequestMapping("/InsertProjectUser")
	public String InsertProjectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ProjectId = Integer.valueOf(request.getParameter("ProjectId")).intValue();
		int UserId = Integer.valueOf(request.getParameter("UserId")).intValue();
		ProjectUser projectUser =new ProjectUser(0, ProjectId, UserId, "0%");
		projectUserService.InsertProjectUser(projectUser);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('增加人员成功，返回首页');");
		out.println("</script>");
		return "../jsp/ProjectUserManage";
	}
	

	@RequestMapping("/DeleteProjectUser")
	public String DeleteProjectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ProjectId = request.getParameter("ProjectId");
		String UserId = request.getParameter("UserId");
		projectUserService.DeleteProjectUser(ProjectId, UserId);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除人员成功，返回首页');");
		out.println("</script>");
		return "../jsp/ProjectUserManage";
	}
	
}
