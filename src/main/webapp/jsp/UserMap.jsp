<%@page import="com.bean.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Title</title>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../Css/TalkBook.css" />
<link rel="stylesheet" type="text/css" href="../css/css.css" />
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
table {
	text-align: center;
}

tr, th {
	align: center;
	text-align: left;
}
/* tr:hover{
		background-color: #93E5E5;
	} */
a:hover {
	text-decoration: none;
	color: red;
}
.div_form {
	/* border:1px solid red; */
	height: 50px;
	width: 100%;
	text-align: center;
	margin-top: 0px;
	background-color: #FCF8E3;
}
.form_input1 {
	width: 300px;
	height: 40px;
	padding-left: 10px;
	margin: 3px 10px;
	/* border-radius: 3px;
	border:1px solid ; */
}
.form_input2 {
	margin-left: 10px;
}
.form_input3 {
	margin-left: 10px;
}
.form_input4 {
	width: 60px;
	height: 30px;
	background-color: #7CBD74;
	border: 0px;
	border-radius: 5px;
	margin-left: 15px;
}
</style>
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/Navbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 col-md-offset-1" style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<div
					style="height: 35px; background-color: #7CBD74; margin-bottom: 10px;">
					<span
						style="width: 92px; height: 35px; font-size: 20px; padding: 8px 0px 0px 10px; margin-top: 3px;">地图信息</span>
				</div>
				<table class="table table-hover table-striped table -borderd">
					<%
						List<Map> list = (List<Map>) request.getAttribute("list");
					%>
					<thead>
						<!-- table  标题栏   -->
						<tr>
							<th>地址说明</th>
							<th>详细地址</th>
							<th>操作</th>
						</tr>

					</thead>
					<tbody>
						<%
							if (list != null) {

								for (int i = 0; i < list.size(); i++) {
						%>
						<tr>
							<td><%=list.get(i).getMapExplain()%></td>
							<td><%=list.get(i).getAddress()%></td>
							<td><a href="SeeMap?MapId=<%=list.get(i).getMapId()%>"><span
									class="glyphicon glyphicon-map-marker"></span></a></td>
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
</body>
</html>