// JavaScript Document
$(function(){
							   $("#holdaytype").change(function(){
																  var si = $("#holdaytype").val();
																  switch(si){
																  	case "0":
																		$("#shijia").css("display","block");
																		$("#nianjia").css("display","none");
																		$("#bingjia").css("display","none");
																		$("#tiaoxiu").css("display","none");
																		break;
																	case "1":
																		$("#nianjia").css("display","block");
																		$("#shijia").css("display","none");
																		$("#bingjia").css("display","none");
																		$("#tiaoxiu").css("display","none");
																		break;																			 																	case "2":
																		$("#bingjia").css("display","block");
																		$("#nianjia").css("display","none");
																		$("#shijia").css("display","none");
																		$("#tiaoxiu").css("display","none");
																		break;
																	case "3":
																		$("#tiaoxiu").css("display","block");
																		$("#nianjia").css("display","none");
																		$("#shijia").css("display","none");
																		$("#bingjia").css("display","none");
																		break;
																	default:
																		$("#tiaoxiu").css("display","none");
																		$("#nianjia").css("display","none");
																		$("#shijia").css("display","none");
																		$("#bingjia").css("display","none");
																  }
																  });
							  	$("#enddate").change(function(){
										var end = new Date($("#enddate").val().replace(/\-/g, '/'));
										var begin = new Date($("#begindate").val().replace(/\-/g, '/'));
										var s1 = begin.getTime();
										var s2 = end.getTime();
										var total = (s2 - s1)/1000;
										var day = parseInt(total / (24*60*60));
										$("#time").val(day+"Ìì");
									})
							   });
