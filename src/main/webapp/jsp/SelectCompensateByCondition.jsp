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
		var CompensateType = $("#CompensateType").val();
		if (CompensateType.length == 0) {
			alert("报销类型不能为空")
			return false;
		}
		return true;
	}
	function checkForm1() {
		var UserID = $("#UserID").val();
		if (UserID.length == 0) {
			alert("报销人id不能为空")
			return false;
		}
		return true;
	}
	function checkForm2() {
		var CompensateStatus = $("#CompensateStatus").val();
		if (CompensateStatus.length == 0) {
			alert("报销状态不能为空")
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

				<form action="SelectCompensateByType" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CompensateType" id="CompensateType" 
									placeholder="请输入报销类型">
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
				
				<form action="SelectCompensateByUserId" onsubmit="return checkForm1();"> 
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserID" id="UserID"
									placeholder="请输入报销人id">
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
				<form action="SelectCompensateByStatus" onsubmit="return checkForm2();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CompensateStatus" id="CompensateStatus"
									placeholder="请输入报销状态">
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