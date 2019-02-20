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
		var LeaveBeginTime = $("#LeaveBeginTime").val();
		var LeaveEndTime = $("#LeaveEndTime").val();
		var LeaveType = $("#LeaveType").val();
		var LeaveReason = $("#LeaveReason").val();
		if (LeaveBeginTime.length == 0) {
			alert("选择开始日期不能为空")
			return false;
		}
		if (LeaveEndTime.length == 0) {
			alert("选择结束日期不能为空")
			return false;
		}
		if (LeaveType.length == 0) {
			alert("请假类型不能为空")
			return false;
		}
		if (LeaveReason.length == 0) {
			alert("请假原因不能为空")
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/Navbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<form action="InsertLeave" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="datetime-local" name="LeaveBeginTime" id="LeaveBeginTime"
									placeholder="请输入开始时间">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="datetime-local" name="LeaveEndTime" id="LeaveEndTime"
									placeholder="请输入结束时间">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="LeaveType"  id="LeaveType"
									placeholder="请输入请假类型">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="LeaveReason" id="LeaveReason" 
									placeholder="请输入请假理由">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control btn btn-info" type="submit"
									value="申请">
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