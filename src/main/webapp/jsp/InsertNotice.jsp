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
		var NoticeContent = $("#NoticeContent").val();
		var NoticePower = $("#NoticePower").val();
		if (NoticeContent.length == 0) {
			alert("公告内容不能为空")
			return false;
		}
		if (NoticePower.length == 0) {
			alert("公告权限不能为空")
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

				<form action="InsertNotice"  onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="NoticeContent" id="NoticeContent"
									placeholder="请输入公告内容">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="NoticePower" id="NoticePower"
									placeholder="请输入公告权限">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						
						
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control btn btn-info" type="submit"
									value="发布">
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