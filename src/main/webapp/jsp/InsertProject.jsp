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
		var ProjectName = $("#ProjectName").val();
		var ProjectContent = $("#ProjectContent").val();
		var ProjectTime = $("#ProjectTime").val();
		var ProjectMoney = $("#ProjectMoney").val();
		var ProjectPMId = $("#ProjectPMId").val();
		if (ProjectName.length == 0) {
			alert("项目名称不能为空")
			return false;
		}
		if (ProjectContent.length == 0) {
			alert("项目内容不能为空")
			return false;
		}
		if (ProjectTime.length == 0) {
			alert("项目时间不能为空")
			return false;
		}
		if (ProjectMoney.length == 0) {
			alert("项目预计估算不能为空")
			return false;
		}
		if (ProjectPMId.length == 0) {
			alert("项目负责人id不能为空")
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

				<form action="InsertProject"  onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ProjectName" id="ProjectName"
									placeholder="请输入项目名称">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ProjectContent" id="ProjectContent"
									placeholder="请输入项目内容">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ProjectTime" id="ProjectTime"
									placeholder="请输入项目时间">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ProjectMoney" id="ProjectMoney"
									placeholder="请输入项目预计预算">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ProjectPMId" id="ProjectPMId"
									placeholder="请输入项目负责人id">
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