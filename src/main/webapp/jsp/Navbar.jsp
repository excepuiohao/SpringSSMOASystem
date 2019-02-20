<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../css/css.css">
<script type="text/javascript" src="../js/js.js"></script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<a href="../jsp/SystemIntroduce.jsp" class="navbar-brand"><span
			class="glyphicon glyphicon-heart-empty"></span> SixOA</a>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="../jsp/NoticeManage.jsp"><span
					class="glyphicon glyphicon-bullhorn"></span> 公告<span class="badge"
					style="background-color: #D9534F"><%=session.getAttribute("noticeCount")%></span></a></li>
			<li><a href="../jsp/Main.jsp"><span
					class="glyphicon glyphicon-home"></span> 主页</a></li>
			<li><a href="UserInfo"><span
					class="glyphicon glyphicon-user"></span> 个人信息</a></li>
		</ul>
	</div>

	<div class="col-sm-3 col-md-2 sidebar">
		<ul class="nav nav-sidebar">
			<li><a href="../jsp/WorkLogManage.jsp"><span
					class="glyphicon glyphicon-book"></span> 工作日志管理</a></li>
					
			<li><a href="../jsp/ProjectManage.jsp"><span
					class="glyphicon glyphicon-folder-open"></span> 项目管理</a></li>
					
			<li><a href="../jsp/LeaveManage.jsp"><span
					class="glyphicon glyphicon-user"></span> 请假离职</a></li>
					
			<li><a href="../jsp/CompensateManage.jsp"><span
					class="glyphicon glyphicon-piggy-bank"></span> 财务报销</a></li>
					
			<li><a href="../jsp/ApartmentManage.jsp"><span
					class="glyphicon glyphicon-th-list"></span> 部门管理</a></li>
					
			<li><a href="../jsp/SalaryManage.jsp"><span
					class="glyphicon glyphicon-credit-card"></span> 财务管理</a></li>
					
			<li><a href="../jsp/CarManage.jsp"><span
					class="glyphicon glyphicon-plane"></span> 班车管理</a></li>
					
			<li><a href="../jsp/InsuranceManage.jsp"><span
					class="glyphicon glyphicon-piggy-bank"></span> 商保管理</a></li>
					
			<li><a href="https://mail.126.com"><span
					class="glyphicon glyphicon-comment"></span> 邮件管理</a></li>
					
			<li><a href="../jsp/MapManage.jsp"><span
					class="glyphicon glyphicon-picture"></span> 地图管理</a></li>
					
			<li><a href="../jsp/CardManage.jsp"><span
					class="glyphicon glyphicon-grain"></span> 考勤管理</a></li>
					
			<li><a href=../jsp/Robot.jsp><span
					class="glyphicon glyphicon-phone-alt"></span> 机器人客服</a></li>
					
		</ul>
	</div>
</body>
</html>
