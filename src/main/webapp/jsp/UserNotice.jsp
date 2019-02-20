<%@page import="com.bean.Notice"%>
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
							style="width: 92px; height: 35px; font-size: 20px; padding: 8px 0px 0px 10px; margin-top: 3px;">公告信息</span>
					</div>
					<table class="table table-hover table-striped table -borderd">
						<%
							List<Notice> list = (List<Notice>) request.getAttribute("list");
						%>
						<thead>
							<!-- table  标题栏   -->
							<tr>
								<th>公告内容</th>
								<th>公告时间</th>
							</tr>

						</thead>
						<tbody>
							<%
								if (list != null) {

									for (int i = 0; i < list.size(); i++) {
							%>
							<tr>
								<%
									if (i == 0) {
								%>
								<td>【置顶公告】<%=list.get(i).getNoticeContent()%></td>
								<%
									} else {
								%>
								<td><%=list.get(i).getNoticeContent()%></td>
								<%
									}
								%>
								<td><%=list.get(i).getNoticeTime()%></td>
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