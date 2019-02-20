<%@page import="com.bean.Compensate"%>
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
		<jsp:include page="/jsp/AdminNavbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<div class="col-sm-10 col-md-10 ">
					<div
						style="height: 35px; background-color: #7CBD74; margin-bottom: 10px;">
						<span
							style="width: 92px; height: 35px; font-size: 20px; padding: 8px 0px 0px 10px; margin-top: 3px;">报销审核</span>
					</div>
					<table class="table table-hover table-striped table -borderd">
						<%
							List<Compensate> list = (List<Compensate>) request.getAttribute("list");
						%>
						<thead>
							<!-- table  标题栏   -->
							<tr>
								<th>报销人id</th>
								<th>报销类型</th>
								<th>报销价格</th>
								<th>报销状态</th>
								<th>操作</th>
							</tr>

						</thead>
						<tbody>
							<%
								if (list != null) {

									for (int i = 0; i < list.size(); i++) {
							%>
							<tr>
								<td><%=list.get(i).getUserID()%></td>
								<td><%=list.get(i).getCompensateType()%></td>

								<td><%=list.get(i).getCompensatePrice()%></td>

								<td><%=list.get(i).getCompensateStatus()%></td>
								<!--  -->
								<td><a
									href="AuditingCompensate?CompensateID=<%=list.get(i).getCompensateID()%>
									&CompensateStatus=<%=list.get(i).getCompensateStatus()%>
									&CompensatePrice=<%=list.get(i).getCompensatePrice()%>
									&UserID=<%=list.get(i).getUserID()%>
									&CompensateType=<%=list.get(i).getCompensateType()%>"><span
										class="glyphicon glyphicon-trash"></span></a></td>
								<!-- 置顶 -->
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