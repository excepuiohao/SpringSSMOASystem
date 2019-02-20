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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.box {
	width: 202px;
	height: 500px;
	margin: 100px auto;
}

.box a {
	width: 200px;
	line-height: 30px;
	margin: 20px 0 0 0;
	display: block;
	border-top: 5px #ccc solid;
	background-color: #A2B5CD;
	text-decoration: none;
	text-align: center;
	color: #000;
}
</style>
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/Navbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<div class="box">
					<a href="UserSelectNotice">查看公告</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>