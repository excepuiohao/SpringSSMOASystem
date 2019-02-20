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
		var userId = $("#userId").val();
		var password = $("#password").val();
		if (userId.length == 0) {
			alert("用户id不能为空")
			return false;
		}
		if (password.length == 0) {
			alert("用户密码不能为空")
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
				<b><span class="glyphicon glyphicon-heart-empty"></span>This Is
					OA</b>
			</h3>
			<p>Login to your account</p>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-xs-12 ">
					<form action="UserLogin" onsubmit="return checkForm();">
						<input style="margin-top: 30px;" class="logininput" type="text"
							name="userId" placeholder="请输入您的个人ID" id="userId"><br>
						<br> <input class="logininput" type="password"
							name="password" id="password" placeholder="请输入您的邮件密码"> <br>
						<input id="logincheckbox" name="remember" type="checkbox">
						<span>记住我</span> <br> <br> <input class="btn btn-info"
							id="loginsubmit" type="submit" value="登录"> <br> <br>
						<input class="btn btn-info" id="loginsubmit" type="reset"
							value="重置"> <br> <br> <span
							style="position: relative; right: 108px;">没有账号?立即<a
							href="../jsp/Regist.jsp">注册</a>或者?<a
							href="../jsp/AdminLogin.jsp">管理员登陆</a></span>
					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>
