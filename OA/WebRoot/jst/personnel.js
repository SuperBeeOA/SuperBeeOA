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
	  
	  $("#bcs").click(function() {
		  $("#allstaff").show();
		  $("#cstaff").hide();
	  });
	  
	  $("#cx").click(function() {
		  var data = $("#allemp").serialize();
		  data= decodeURIComponent(data,true);
		  $("#zs").load("allemp.action",data);
	  });
	  
	  $(".xg").click(function() {
		  $("#cstaff").show();
		  $("#allstaff").hide();
		  var workid = $(this).siblings(".workid").val();
		  $("#cstaff").load("aemp.action","workid="+workid);
	  });
});