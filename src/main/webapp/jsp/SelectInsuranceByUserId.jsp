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
		var UserId = $("#UserId").val();
		if (UserId.length == 0) {
			alert("用户id不能为空")
			return false;
		}
		return true;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/AdminNavbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<form action="SelectInsuranceByUserId" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserId" id="UserId" 
									placeholder="请输入商保人id">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control btn btn-info" type="submit"
									value="查找">
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