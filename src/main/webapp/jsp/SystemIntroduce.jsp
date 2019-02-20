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
					<h4>系统介绍</h4>
					</br>
					</br>
					</br> 目前国内中小企业办公事务管理普遍不够系统和规范，本系统主要是模拟了实习中的公司办公系统，
					可以有效提高办事效率，使日常工作有章可循。本系统具备中小公司最常用最需要的业务功能，方便企事
					业单位日常工作管理。当然本系统在性能和吞吐量上达不到正规办公系统的要求，但是如果用户量不过百 应该还是没有问题的。 </br></br>
					本系统具备中小公司最常用最需要的业务功能，方便企事业单位日常工作管理。 </br></br> 本系统采用B/S架构模式， 基于Spring+Spring
					MVC+MyBaits实现，数据库使用Oracle。开发工具使用Eclipse。对系统
					中的业务逻辑等都进行了相关的设计。使得各个层中的业务，数据，显示等都进行了隔离，如果·以后要进
					行2次开发，相关的难度会降低。同时本系统也会对数据库进行相关的操作，比如每天的备份，事务管理等，
					力求达到真实环境中的样子。在编码设计时，也会进行相应的处理，尽量符合编码规范，该异常处理的处理，
					该同步的资源同步，该异步的异步，java性能等也会按照情况进行相应的优化。力求开发出公司中真实的系统。
				</div>
			</div>
		</div>
	</div>


</body>
</html>