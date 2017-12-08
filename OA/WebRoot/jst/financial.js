$(function() {
	  $("#te").click(function() {
		  $("#teo").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
	  });

	  $("#sm").click(function() {
		  $("#smoney").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
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