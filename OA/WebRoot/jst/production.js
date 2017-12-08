$(function() {
	  $("#te").click(function() {
		  $("#teo").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		  $("#ars").hide();
		  $("#irs").hide();
	  });

	  $("#ar").click(function() {
		  $("#ars").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		  $("#teo").hide();
		  $("#irs").hide();
	  });

	  $("#ir").click(function() {
		  $("#irs").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		  $("#ars").hide();
		  $("#teo").hide();
	  });
	  
	  $("#examine").click(function() {
		  $("#order").show();
		  $("#allorder").hide();
	  });

	  $("#bo").click(function() {
		  $("#allorder").show();
		  $("#order").hide();
	  });
});