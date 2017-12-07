$(function() {
<<<<<<< HEAD
	$(".nav-stacked li").click(function() {
		$(this).siblings().removeClass("active");
		$(this).addClass("active");
=======
	$(".nav li").click(function() {
		$(this).siblings().removeAttr("class");
		$(this).attr("class","active");
>>>>>>> 3028ccd2c35c8b552f09df1620b49e3a51af733a
	});
	
	$("#login").click(function() {
		$("#log").show();
	});
	
	$("#out").click(function() {
		$("#log").hide();
	});
});