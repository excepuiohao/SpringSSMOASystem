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
		var Endowment = $("#Endowment").val();
		var Medical = $("#Medical").val();
		var Unemployment = $("#Unemployment").val();
		var Employment = $("#Employment").val();
		var Maternity = $("#Maternity").val();
		var Housing = $("#Housing").val();
		if (UserId.length == 0) {
			alert("用户id不能为空")
			return false;
		}
		if (Endowment.length == 0) {
			alert("养老保险金额不能为空")
			return false;
		}
		if (Medical.length == 0) {
			alert("医疗报销金额不能为空")
			return false;
		}
		if (Unemployment.length == 0) {
			alert("失业保险不能为空")
			return false;
		}
		if (Employment.length == 0) {
			alert("工伤保险金额不能为空")
			return false;
		}
		if (Maternity.length == 0) {
			alert("生育报销金额不能为空")
			return false;
		}
		if (Housing.length == 0) {
			alert("住房公积金不能为空")
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

				<form action="InsertFiveRisksOneGold" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="UserId" id="UserId"
									placeholder="请输入用户id">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="Endowment" id="Endowment"
									placeholder="请输入养老保险金额">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="Medical" id="Medical"
									placeholder="请输入医疗保险金额">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="Unemployment" id="Unemployment"
									placeholder="请输入失业保险金额">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="Employment" id="Employment"
									placeholder="请输入工伤保险金额">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="Maternity" id="Maternity"
									placeholder="请输入生育保险金额">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="Housing" id="Housing"
									placeholder="请输入住房公积金金额">
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





			</div>
		</div>
	</div>


</body>
</html>