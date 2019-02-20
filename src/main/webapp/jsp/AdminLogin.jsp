<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
<script src="../js/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../css/css.css">
<script type="text/javascript">
	function checkForm() {
		var AdminId = $("#AdminId").val();
		var AdminPassword = $("#AdminPassword").val();
		if (AdminId.length == 0) {
			alert("管理员id不能为空")
			return false;
		}
		if (AdminPassword.length == 0) {
			alert("管理员密码不能为空")
			return false;
		}
		return true;
	}
</script>
</head>
<body
	style="background-color: #EEEEEE; background-image: url(../img/login.png); overflow: hidden;">

	<div id="login">
		<div id="logintitle">
			<h3>
				<b><span class="glyphicon glyphicon-heart-empty"></span>管理员登陆</b>
			</h3>
			<p>Login to your account</p>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-xs-12 ">
					<form action="AdminLogin" onsubmit="return checkForm();">
						<input style="margin-top: 30px;" class="logininput" type="text"
							name="AdminId" placeholder="请输入您的个人ID" id="AdminId"><br>
						<br> <input class="logininput" type="password"
							name="AdminPassword" id="AdminPassword" placeholder="请输入您的密码"> <br>
						<input id="logincheckbox" name="remember" type="checkbox">
						<span>记住我</span> <br> <br> <input class="btn btn-info"
							id="loginsubmit" type="submit" value="登录"> <br> <br>
						<input class="btn btn-info" id="loginsubmit" type="reset"
							value="重置"> <br> <br> <span
							style="position: relative; right: 108px;"><a
							href="../jsp/Login.jsp">用户登陆</a></span>
					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>
