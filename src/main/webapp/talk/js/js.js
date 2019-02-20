function go(val){
    $(".window").append("<div class='clearfix'>" +
        "<div class='xiaoxi2'><div class='xiaoxi-tou'>  : <span class='glyphicon glyphicon-heart-empty'></span></div>" +
        "<div class='xiaoxi-ifo'><span>" + val + "</span></div>" +
        "</div>" +
        "</div>");
    scrollbottom();
}
function reply(val){
    $(".window").append("<div class='clearfix'>" +
        "<div class='xiaoxi1'>" +
        "<div class='xiaoxi-tou'><span class='glyphicon glyphicon-heart-empty'></span> :  </div>" +
        "<div class='xiaoxi-ifo'><span>" + val + "</span></div>" +
        "</div>" +
        "</div>");
    scrollbottom();

}
function scrollbottom(){
    $(".window").scrollTop(999999999);
}