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
		  $.getJSON('balance.action',function(result){
			  var jsonObj = result;
			  $('#settleAccounts').append("<tr>"+
					  "<td>"+result.employeeid+"</td>"+
					  "<td>"+result.name+"</td>"+
					  "<td>"+result.money+"</td>"+
					  "<td>"+result.performancebonus+"</td>"+
					  "<td>"+result.time+"</td>"+
					  "<td>"+result.wage+"</td>");
		  });
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