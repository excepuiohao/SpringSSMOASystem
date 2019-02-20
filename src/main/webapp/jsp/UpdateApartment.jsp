<%@page import="com.bean.Apartment"%>
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
		var ApartmentName = $("#ApartmentName").val();
		var ApartmentPMId = $("#ApartmentPMId").val();
		var ApartmentExplain = $("#ApartmentExplain").val();
		if (ApartmentName.length == 0) {
			alert("部门名不能为空")
			return false;
		}
		if (ApartmentPMId.length == 0) {
			alert("部门负责人不能为空")
			return false;
		}
		if (ApartmentExplain.length == 0) {
			alert("部门说明不能为空")
			return false;
		}
		return true;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="row ">
		<jsp:include page="/jsp/Navbar.jsp"></jsp:include>
		<div class="col-sm-9 col-md-10 " style="padding-top: 100px">
			<div class="row ">
				<div class="col-sm-2 col-md-2 "></div>
				<%
				Apartment apartment = (Apartment) request.getAttribute("apartment");
				%>
				<form action="UpdateApartment2" onsubmit="return checkForm();">
					<div class="container regist">
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ApartmentName"  id="ApartmentName"
									placeholder="部门名为：<%=apartment.getApartmentName()%>">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ApartmentPMId"  id="ApartmentPMId" 
									placeholder="部门老大为：<%=apartment.getApartmentPMId()%>"">
							</div>
							<div class="col-xs-3"></div>
						</div>
						<div class="row">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ApartmentExplain" id="ApartmentExplain"
									placeholder="部门说明为：<%=apartment.getApartmentExplain()%>"">
							</div>
							<div class="col-xs-3"></div>
						</div>


						<div class="row" style="display: none">
							<div class="col-xs-3"></div>
							<div class="col-xs-6 regist_input">
								<input class="form-control" type="text" name="ApartmentId"
									value="<%=apartment.getApartmentId()%>"">
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