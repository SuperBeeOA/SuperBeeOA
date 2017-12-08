$(function() {
	  $("#np").click(function() {
		  $("#add").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#manage").hide();
	  });
	  
	  $("#mp").click(function() {
		  $("#manage").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#add").hide();
	  });
	  
	  $("#cs").click(function() {
		  $("#cstaff").show();
		  $("#allstaff").hide();
		  $("#fstaff").hide();
	  });
	  
	  $("#fs").click(function() {
		  $("#fstaff").show();
		  $("#allstaff").hide();
		  $("#cstaff").hide();
	  });
	  
});