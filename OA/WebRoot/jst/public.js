$(function() {
  $("#cp" ).click(function() {
	  $("#cpf").show();
  });
	
  $("#close").click(function() {
	  $("#cpf").hide();
  });
  
  $("#mi").click(function() {
	  $(this).parents().siblings(".active").removeClass("active");
	  $(this).parent().addClass("active");
	  $("#info").show();
	  $("#attendance").hide();
	  $("#announcement").hide();
	  $("#contact").hide();
  });

  $("#fat").click(function() {
	  $(this).parents().siblings(".active").removeClass("active");
	  $(this).parent().addClass("active");
	  $("#attendance").show();
	  $("#info").hide();
	  $("#announcement").hide();
	  $("#contact").hide();
  });
  
  $("#fan").click(function() {
	  $(this).parents().siblings(".active").removeClass("active");
	  $(this).parent().addClass("active");
	  $("#announcement").show();
	  $("#attendance").hide();
	  $("#info").hide();
	  $("#contact").hide();
  });
  
  $("#fc").click(function() {
	  $(this).parents().siblings(".active").removeClass("active");
	  $(this).parent().addClass("active");
	  $("#contact").show();
	  $("#attendance").hide();
	  $("#announcement").hide();
	  $("#info").hide();
  });
  
  $("#if").click(function() {
	  $("#in").show();
	  $("#out").hide();
  });
  
  $("#of").click(function() {
	  $("#out").show();
	  $("#in").hide();
  });
});