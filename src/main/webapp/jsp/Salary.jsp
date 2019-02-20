<%@page import="com.bean.Salary"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Title</title>
<link rel="stylesheet" type="text/css"
	href="bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="Css/TalkBook.css" />
<link rel="stylesheet" type="text/css" href="css/css.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/Navbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<div class="col-sm-10 col-md-10 ">
					<div
						style="height: 35px; background-color: #7CBD74; margin-bottom: 10px;">
						<span
							style="width: 92px; height: 35px; font-size: 20px; padding: 8px 0px 0px 10px; margin-top: 3px;">工资信息-------------公式：工资=员工考勤金额+员工补贴金额+员工报销金额-五险一金金额
						</span>
					</div>
					<table class="table table-hover table-striped table -borderd">
						<%
							List<Salary> list = (List<Salary>) request.getAttribute("list");
						%>
						<thead>
							<!-- table  标题栏   -->
							<tr>
								<th>员工id</th>
								<th>员工底薪</th>
								<th>员工考勤</th>
								<th>员工报销</th>
								<th>员工补贴</th>
								<th>员工五险一金</th>
								<th>员工实发工资</th>
								<th>发放时间</th>
								<th>发放月份</th>
							</tr>

						</thead>
						<tbody>
							<%
								if (list != null) {

									for (int i = 0; i < list.size(); i++) {
							%>
							<tr>
								<td><%=list.get(i).getUserID()%></td>
								<td><%=list.get(i).getUserBaseSalary()%></td>
								<td><%=list.get(i).getUserAttence()%></td>
								<td><%=list.get(i).getUserCompensate()%></td>
								<td><%=list.get(i).getUserSubsidy()%></td>
								<td><%=list.get(i).getFiveRiskOneGold()%></td>
								<td><%=list.get(i).getUserGetSalary()%></td>
								<td><%=list.get(i).getGrantTime()%></td>
								<td><%=list.get(i).getSalaryMonth()%></td>
							</tr>

							<%
								}
								}
							%>
						</tbody>
					</table>

				</div>
			</div>
		</div>
	</div>


</body>
</html>