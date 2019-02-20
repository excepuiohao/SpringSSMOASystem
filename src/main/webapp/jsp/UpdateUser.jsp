<%@page import="com.bean.Users"%>
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
<script type="text/javascript">
	function checkForm() {
		var UserName = $("#UserName").val();
		var UserSex = $("#UserSex").val();
		var UserPhone = $("#UserPhone").val();
		var UserAddress = $("#UserAddress").val();
		var UserApartment = $("#UserApartment").val();
		var UserEmailId = $("#UserEmailId").val();
		var EmailPassword = $("#EmailPassword").val();
		var UserSalary = $("#UserSalary").val();
		var UserPMID = $("#UserPMID").val();
		var UserLevel = $("#UserLevel").val();
		var UserTime = $("#UserTime").val();
		if (UserName.length == 0) {
			alert("用户名不能为空")
			return false;
		}
		if (UserSex.length == 0) {
			alert("用户性别不能为空")
			return false;
		}
		if (UserPhone.length == 0) {
			alert("用户电话不能为空")
			return false;
		}
		if (UserAddress.length == 0) {
			alert("用户住址不能为空")
			return false;
		}
		if (UserApartment.length == 0) {
			alert("用户部门不能为空")
			return false;
		}
		if (UserEmailId.length == 0) {
			alert("用户邮箱号不能为空")
			return false;
		}
		if (EmailPassword.length == 0) {
			alert("用户密码不能为空")
			return false;
		}
		if (UserSalary.length == 0) {
			alert("基本工资不能为空")
			return false;
		}
		if (UserPMID.length == 0) {
			alert("上级领导不能为空")
			return false;
		}
		if (UserLevel.length == 0) {
			alert("用户级别不能为空")
			return false;
		}
		if (UserTime.length == 0) {
			alert("带薪休假时间不能为空")
			return false;
		}
		return true;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/Navbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<%
					Users users = (Users) request.getAttribute("users");
				%>
				<form action="UpdateUser" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserName"  id="UserName"
									placeholder="个人姓名为：<%=users.getUserName()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserSex" id="UserSex"
									placeholder="个人性别为：<%=users.getUserSex()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserPhone" id="UserPhone"
									placeholder="个人电话为：<%=users.getUserPhone()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserAddress" id="UserAddress"
									placeholder="个人地址为：<%=users.getUserAddress()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserApartment" id="UserApartment"
									placeholder="个人部门为：<%=users.getUserApartment()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>

						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserEmailId" id="UserEmailId"
									placeholder="个人邮箱为：<%=users.getUserEmailId()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserSalary" id="UserSalary"
									placeholder="个人工资为：<%=users.getUserSalary()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserLevel" id="UserLevel"
									placeholder="个人级别为：<%=users.getUserLevel()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserTime" id="UserTime"
									placeholder="个人可休假时间为：<%=users.getUserTime()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="EmailPassword" id="EmailPassword"
									placeholder="个人密码为：<%=users.getEmailPassword()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserPMID" id="UserPMID"
									placeholder="PM为：<%=users.getUserPMID()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row" style="display: none">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserId" 
									value="<%=users.getUserId()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CarId" id="CarId"
									placeholder="班车号为：<%=users.getCarId()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>

						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control btn btn-info" type="submit"
									value="修改">
							</div>
							<div class="col-xs-3"></div>
						</div>

					</div>
				</form>

			</div>
		</div>
	</div>


</body>
</html>