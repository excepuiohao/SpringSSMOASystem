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
<script type="text/javascript">
	function checkForm() {
		var ApartmentId = $("#ApartmentId").val();
		var UserId = $("#UserId").val();
		if (ApartmentId.length == 0) {
			alert("部门id不能为空")
			return false;
		}
		if (UserId.length == 0) {
			alert("用户id不能为空")
			return false;
		}
		return true;
	}
	function checkForm1() {
		var ApartmentId1 = $("#ApartmentId1").val();
		var UserId1 = $("#UserId1").val();
		if (ApartmentId1.length == 0) {
			alert("部门id不能为空")
			return false;
		}
		if (UserId1.length == 0) {
			alert("用户id不能为空")
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/AdminNavbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>

				<form action="InsertApartmentUser" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ApartmentId" id="ApartmentId"
									placeholder="请输入部门号">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserId" id="UserId"
									placeholder="请输入人员号">
							</div>
							<div class="col-xs-3"></div>
						</div>


						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control btn btn-info" type="submit" 
									value="增加">
							</div>
							<div class="col-xs-3"></div>
						</div>
					</div>
				</form>


				<form action="DeleteApartmentUser" onsubmit="return checkForm1();" >
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ApartmentId" id="ApartmentId1"
									placeholder="请输入部门号">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserId" id="UserId1"
									placeholder="请输入人员号">
							</div>
							<div class="col-xs-3"></div>
						</div>


						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control btn btn-info" type="submit"
									value="删除">
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