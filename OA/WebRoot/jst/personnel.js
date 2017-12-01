$(function() {
	  $("#np").click(function() {
		  $(this).parents().siblings(".active").removeClass("active");
		  $(this).parent().addClass("active");
		  $("#").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
	  });
	  
	  $("#mp").click(function() {
		  $(this).parents().siblings(".active").removeClass("active");
		  $(this).parent().addClass("active");
		  $("#").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
	  });
	  
});