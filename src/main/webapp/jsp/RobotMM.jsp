<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../talk/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="../talk/css/css.css"/>
    <script type="text/javascript" src="../talk/js/jquery.min.js"></script>
    <script type="text/javascript" src="../talk/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../talk/js/js.js"></script>
</head>
<body>
    <div id="main">
        <div class="ifo">
            <img src="../talk/img/nvtoux1.jpg"/>
            <span><b>客服小妹妹~~~</b></span>
            <button id="close" type="button" class="close">&times;</button>
        </div>
        <div class="window">
            <div class="clearfix">
                <div class="xiaoxi1">
                    <div class="xiaoxi-tou"><span class="glyphicon glyphicon-heart-empty"></span> :  </div>
                    <div class="xiaoxi-ifo"><span>你好！我是客服小妹~~</span></div>
                </div>
            </div>
        </div>
        <div class="qqshow">
            <img src="../talk/img/qqshow.jpg" alt="">
        </div>
        <div class="fasong"><textarea clientidmode="Static" placeholder="说点什么吧~~"></textarea></div>
        <div class="anniu">
            <button id="gof" class="btn btn-success">发送</button>
            <button id="fh" class="btn btn-warning">返回</button></div>
    </div>


<script>
    $("#gof").click(function(){
        var val = $("textarea").val();
		$(".window-lis").css("display","none");
        if(val!=""&&val!=null) {
            go(val);
            $("textarea").val('');
            $.post("LMYRobot/"+val,function(data){
            	reply(data.message);
            },"json")
        } else{
            alert("输入不能为空哦！");
        }
    });
    $("textarea").keydown(function(event) {
        var keyCode = event.keyCode;
        if(keyCode == 13) {
            $("#gof").click();
            event.preventDefault();
        }
    });
    $("#fh").click(function(){
    	location="selectByPageview";
    })
</script>
</body>
</html>