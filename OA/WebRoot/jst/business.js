$(function() {
	  $("#fo").click(function() {
		  $("#forder").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#aorder").hide();
		  $("#customer").hide();
		  $("#supplier").hide();
	  });

	  $("#ao").click(function() {
		  $("#aorder").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#forder").hide();
		  $("#customer").hide();
		  $("#supplier").hide();
	  });

	  $("#mc").click(function() {
		  $("#customer").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#aorder").hide();
		  $("#forder").hide();
		  $("#supplier").hide();
	  });

	  $("#ms").click(function() {
		  $("#supplier").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#aorder").hide();
		  $("#customer").hide();
		  $("#forder").hide();
	  });
});