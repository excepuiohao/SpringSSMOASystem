<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<style type="text/css">
body, html {
	width: 100%;
	height: 100%;
	margin: 0;
	font-family: "微软雅黑";
}

#allmap {
	width: 100%;
	height: 100%;
}

p {
	margin-left: 5px;
	font-size: 14px;
}
</style>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=1cVtvaeTLrwEiGjgcHC1ZxrSOiPMYEdl"></script>
<title>查看地图</title>
</head>
<body>
	<input id="i1" type="hidden"
		value="<%=request.getAttribute("startLongitude")%>">
	<input id="i2" type="hidden"
		value="<%=request.getAttribute("startLatitude")%>">
	<input id="i3" type="hidden"
		value="<%=request.getAttribute("MapExplain")%>">
	<input id="i4" type="hidden"
		value="<%=request.getAttribute("Address")%>">
	<div id="allmap"></div>
</body>
</html>
<script type="text/javascript">
	var a = document.getElementById("i1").value;
	var b = document.getElementById("i2").value;
	var c = document.getElementById("i3").value;
	var d = document.getElementById("i4").value;
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(a, b);
	var marker = new BMap.Marker(point); // 创建标注
	map.addOverlay(marker); // 将标注添加到地图中
	map.centerAndZoom(point, 15);
	var opts = {
		width : 200, // 信息窗口宽度
		height : 100, // 信息窗口高度
		title : c, // 信息窗口标题
		enableMessage : true,//设置允许信息窗发送短息
		message : d
	}
	var infoWindow = new BMap.InfoWindow(d, opts); // 创建信息窗口对象 
	marker.addEventListener("click", function() {
		map.openInfoWindow(infoWindow, point); //开启信息窗口
	});
</script>
