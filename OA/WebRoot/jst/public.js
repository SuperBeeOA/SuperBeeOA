$(function() {
  $("#cp" ).click(function() {
	  $("#cpf").show();
  });
	
  $("#close").click(function() {
	  $("#cpf").hide();
  });
  
  $("#mi").click(function() {
	  $("#info").show();
	  $("#attendance").hide();
	  $("#announcement").hide();
	  $("#contact").hide();
	  $("#add").hide();
	  $("#manage").hide();
	  $("#forder").hide();
	  $("#aorder").hide();
	  $("#customer").hide();
	  $("#supplier").hide();
  });

  $("#fat").click(function() {
	  $("#attendance").show();
	  $("#info").hide();
	  $("#announcement").hide();
	  $("#contact").hide();
	  $("#add").hide();
	  $("#manage").hide();
	  $("#forder").hide();
	  $("#aorder").hide();
	  $("#customer").hide();
	  $("#supplier").hide();
  });
  
  $("#fan").click(function() {
	  $("#announcement").show();
	  $("#attendance").hide();
	  $("#info").hide();
	  $("#contact").hide();
	  $("#add").hide();
	  $("#manage").hide();
	  $("#forder").hide();
	  $("#aorder").hide();
	  $("#customer").hide();
	  $("#supplier").hide();
  });
  
  $("#fc").click(function() {
	  $("#contact").show();
	  $("#attendance").hide();
	  $("#announcement").hide();
	  $("#info").hide();
	  $("#add").hide();
	  $("#manage").hide();
	  $("#forder").hide();
	  $("#aorder").hide();
	  $("#customer").hide();
	  $("#supplier").hide();
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