<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>劳动合同签订</title>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../Css/TalkBook.css" />
<link rel="stylesheet" type="text/css" href="../css/css.css" />
<script type="text/javascript">
	function checkForm() {
		var ContractContent = $("#ContractContent").val();
		var ContractType = $("#ContractType").val();
		var UserId = $("#UserId").val();
		var ContractBeginTime = $("#ContractBeginTime").val();
		var ContractEndTime = $("#ContractEndTime").val();
		if (ContractContent.length == 0) {
			alert("合同内容不能为空")
			return false;
		}
		if (ContractType.length == 0) {
			alert("合同类型不能为空")
			return false;
		}
		if (UserId.length == 0) {
			alert("用户id不能为空")
			return false;
		}
		if (ContractBeginTime.length == 0) {
			alert("合同生效时间不能为空")
			return false;
		}
		if (ContractEndTime.length == 0) {
			alert("合同失效时间不能为空")
			return false;
		}
		return true;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form action="SignContract" onsubmit="return checkForm();">
		<div class="container regist" >
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="ContractContent" id="ContractContent"
						placeholder="请输入劳动合同内容">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="ContractType" id="ContractType"
						placeholder="请输入劳动合同类型">
				</div>
				<div class="col-xs-3"></div>
			</div>
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
					<input class="form-control" type="text" name="ContractBeginTime" id="ContractBeginTime"
						placeholder="请输入合同生效时间">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control" type="text" name="ContractEndTime" id="ContractBeginTime"
						placeholder="请输入劳动失效时间">
				</div>
				<div class="col-xs-3"></div>
			</div>
			<div class="row">
				<div class="col-xs-3"></div>
				<div class="col-xs-6 regist_input">
					<input class="form-control btn btn-info" type="submit" value="确定">
				</div>
				<div class="col-xs-3"></div>
			</div>
			
		</div>
	</form>


</body>
</html>