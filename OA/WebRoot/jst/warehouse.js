$(function() {
	$("#fs").click(function() {
		  $("#fstock").show();
		  $("#mstock").hide();
		  $("#tin").hide();
		  $("#tout").hide();
	});

	$("#ms").click(function() {
		  $("#mstock").show();
		  $("#fstock").hide();
		  $("#tin").hide();
		  $("#tout").hide();
	});

	$("#ti").click(function() {
		  $("#tin").show();
		  $("#mstock").hide();
		  $("#fstock").hide();
		  $("#tout").hide();
	});

	$("#to").click(function() {
		  $("#tout").show();
		  $("#mstock").hide();
		  $("#tin").hide();
		  $("#fstock").hide();
	});
});