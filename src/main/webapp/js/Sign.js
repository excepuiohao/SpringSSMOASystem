/**
 * Created by St01 on 2017-10-10.
 */
/* 时间 */
var times = new function () {
    window.setInterval(function(){

        var time_signs = document.getElementById('time_sign');
        var time = new Date();
        // 程序计时的月从0开始
        var months = time.getMonth() + 1;
        var hours = time.getHours();
        var minutes = time.getMinutes();
        var seconds = time.getSeconds();
        if(time.getHours() < 10){
            hours = "0"+ time.getHours();
        }
        if(time.getMinutes() < 10){
            minutes = "0"+ time.getMinutes();
        }
        if(time.getSeconds() < 10){
            seconds = "0"+ time.getSeconds();
        }
        var t = time.getFullYear() + "-" + months + "-" + time.getDate() + " " +
                hours +":" + minutes +":"+seconds;

        time_signs.innerHTML = t;
    }, 1000);
};
