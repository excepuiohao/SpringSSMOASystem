<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../css/css.css">
<script type="text/javascript" src="../js/js.js"></script>
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
</head>
<body>
	<div id="logintitle">
		<h3>
			<b><span class="glyphicon glyphicon-heart-empty"></span>SixOA</b>
		</h3>
		<p>Open new world's door</p>
	</div>
	<form action="UserRegist" onsubmit="return checkForm();">
		<div class="container regist">
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserName" id="UserName"
						placeholder="请输入姓名">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserSex" id="UserSex"
						placeholder="请输入性别">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserPhone" id="UserPhone"
						placeholder="请输入电话号码">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserAddress" id="UserAddress"
						placeholder="请输入地址">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserApartment" id="UserApartment"
						placeholder="请输入部门">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserEmailId" id="UserEmailId"
						placeholder="请输入邮箱">
				</div>
				<div class="col-xs-3"></div>
			</div>

			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="EmailPassword" id="EmailPassword"
						placeholder="请输入邮箱密码">
				</div>
				<div class="col-xs-3"></div>
			</div>

			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserSalary" id="UserSalary"
						placeholder="请输入基本工资">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserPMID" id="UserPMID" 
						placeholder="请输入PMID">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserLevel" id="UserLevel"
						placeholder="请输入员工级别">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="UserTime"  id="UserTime"
						placeholder="请输入带薪休假时间">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control btn btn-info" type="submit" value="注册">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					已有账号?立即<a href="../jsp/Login.jsp">登录</a>
				</div>
				<div class="col-xs-3"></div>
			</div>
		</div>
	</form>
</body>
</html>