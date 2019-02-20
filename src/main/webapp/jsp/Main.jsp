<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OA系统</title>
<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../css/css.css">
<script type="text/javascript" src="../js/js.js"></script>
</head>
<body>


	<jsp:include page="/jsp/Navbar.jsp"></jsp:include>

	<div>
		<div class="jumbotron">
			<h1>This is MyOA!欢迎您：<%=request.getSession().getAttribute("userNameName")%></h1>
			<P>This is my graduation project, an office system designed with
				java coding.</P>
		</div>

		<div class="container">
			<div class="row">
				<div class="col-md-4 myinf">
					<div id="circle">
						<h4>打卡</h4>
						<input type="hidden" value="0" id="signType" />
						<div id="sysdate"></div>
						<script type="text/javascript">
							jishi()
						</script>
					</div>
					<script type="text/javascript">
						$(function() {
							$("#circle").click(
									function() {
										window.location = "SignCard?";
									});
						});
					</script>

				</div>
				<div class="col-md-4 myinf">
					<h3>项目1进度</h3>
					<div class="progress progress-striped active">
						<div class="progress-bar progress-bar-success" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 30%;">
							<span class="">30%</span>
						</div>
					</div>

					<h3>项目2进度</h3>
					<div class="progress progress-striped active">
						<div class="progress-bar progress-bar-info" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 50%;">
							<span class="">50%</span>
						</div>
					</div>

					<h3>项目3进度</h3>
					<div class="progress progress-striped active">
						<div class="progress-bar progress-bar-danger" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 20%;">
							<span class="">20%</span>
						</div>
					</div>
				</div>

				<div class="col-md-4 myinf">
					<h3>公司信念</h3>
					<hr>
					<p>始终相信美好的事情即将发生</p>
					<hr>
					<p>让每个人都享受到科技的乐趣</p>
					<hr>
				</div>
			</div>


			<div class="row">
				<div class="col-md-4 myinf">
					<h3>公司价值观</h3>
					<p>SINCERITY PASSION</p>
					<hr>
					<p>真诚和热爱</p>
				</div>
				<div class="col-md-4 myinf">
					<h3>公司口号</h3>
					<p>BE THE COOLEST COMPANY IN THE HEARS OF OUR CUSTOMER</p>
					<hr>
					<p>做客户心中最酷的公司</p>
				</div>
				<div class="col-md-4 myinf">
					<h3>公司承诺</h3>
					<p>TRUST IS THE BASIC OPERATING MECHINAS</p>
					<hr>
					<p>信任是基本的运行机制</p>
 				</div>

			</div>
		</div>


	</div>
</body>
</html>