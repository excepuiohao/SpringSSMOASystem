<%@page import="com.bean.Car"%>
<%@page import="java.util.List"%>
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
		var CarLine = $("#CarLine").val();
		var DriverId = $("#DriverId").val();
		var CarModel = $("#CarModel").val();
		var CarTime = $("#CarTime").val();
		if (CarLine.length == 0) {
			alert("行车线路不能为空")
			return false;
		}
		if (DriverId.length == 0) {
			alert("司机id不能为空")
			return false;
		}
		if (CarModel.length == 0) {
			alert("班车类型不能为空")
			return false;
		}
		if (CarTime.length == 0) {
			alert("班车时间不能为空")
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
				<%
					Car car = (Car) request.getAttribute("car");
				%>
				<form action="UpdateCar2" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CarLine" id="CarLine"
									placeholder="请输入班车线路，原线路为：<%=car.getCarLine()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="DriverId" id="DriverId"
									placeholder="请输入司机id，原id为：<%=car.getDriverId()%>"">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CarNumber" id="CarNumber" 
									placeholder="请输入班车人数，原人数为：<%=car.getCarNumber()%>"">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CarModel" id="CarModel"
									placeholder="请输入班车型号，原型号为：<%=car.getCarModel()%>"">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CarTime" id="CarTime"
									placeholder="请输入班车时间，原时间为：<%=car.getCarTime()%>"">
							</div>
							<div class="col-xs-3"></div>
						</div>


						<div class="row" style="display: none">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="CarId"
									value="<%=car.getCarId()%>"">
							</div>
							<div class="col-xs-3"></div>
						</div>
						
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control btn btn-info" type="submit"
									value="修改">
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