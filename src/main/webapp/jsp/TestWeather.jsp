<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>天气预报查询</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <style type="text/css">
        #weather {
            height: 180px;
            background-color: #fff;
            padding-left: 10px;
            padding-right: 10px;
            position: absolute;
            bottom: 20px;
            font-size: 12px;
            right: 10px;
            border-radius: 3px;
            line-height: 20px;
            border: 1px solid #ccc;
        }
        .weather{
            width: 60px;
            padding-left: 8px;
            display: inline-block;
        }
    </style>
    <script type="text/javascript" src="http://webapi.amap.com/maps?v=1.4.6&key=99e351e8298d010e27fa7e82be6ad22b"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
</head>
<body>
<div id="container"></div>
<div id="tip" style="line-height: 24px"></div>
<script type="text/javascript">
    var map = new AMap.Map('container', {
        resizeEnable: true,
		center: [116.486409,39.921489],
        zoom: 12
    });
    AMap.service('AMap.Weather', function() {
        var weather = new AMap.Weather();
        //查询实时天气信息, 查询的城市到行政级别的城市，如朝阳区、杭州市
        weather.getLive('朝阳区', function(err, data) {
            if (!err) {
                var str = [];
                str.push('<div style="color: #3366FF;">实时天气' + '</div>');
                str.push('<div>城市/区：' + data.city + '</div>');
                str.push('<div>天气：' + data.weather + '</div>');
                str.push('<div>温度：' + data.temperature + '℃</div>');
                str.push('<div>风向：' + data.windDirection + '</div>');
                str.push('<div>风力：' + data.windPower + ' 级</div>');
                str.push('<div>空气湿度：' + data.humidity + '</div>');
                str.push('<div>发布时间：' + data.reportTime + '</div>');
                var marker = new AMap.Marker({map: map, position: map.getCenter()});
                var infoWin = new AMap.InfoWindow({
                    content: str.join(''),
                    offset: new AMap.Pixel(0, -20)
                });
                infoWin.open(map, marker.getPosition());
                marker.on('mouseover', function() {
                    infoWin.open(map, marker.getPosition());
                });
            }
        });
        //未来4天天气预报
        weather.getForecast('朝阳区', function(err, data) {
            if (err) {return;}
            var str = [];
            for (var i = 0,dayWeather; i < data.forecasts.length; i++) {
                dayWeather = data.forecasts[i];
                str.push(dayWeather.date+' <div class="weather">'+dayWeather.dayWeather+'</div> '+ dayWeather.nightTemp + '~' + dayWeather.dayTemp + '℃');
            }
            document.getElementById('tip').innerHTML = str.join('<br>');
        });
    });
</script>
</body>
</html>