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
	$("#smoney").hide();
	$("#teo").hide();
	$("#ars").hide();
	$("#irs").hide();
	$("#fteout").hide();
	$("#fout").hide();
	$("#tematerial").hide();
	$("#mwarehouse").hide();
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
	$("#smoney").hide();
	$("#teo").hide();
	$("#ars").hide();
	$("#irs").hide();
	$("#fteout").hide();
	$("#fout").hide();
	$("#tematerial").hide();
	$("#mwarehouse").hide();
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
	$("#smoney").hide();
	$("#teo").hide();
	$("#ars").hide();
	$("#irs").hide();
	$("#fteout").hide();
	$("#fout").hide();
	$("#tematerial").hide();
	$("#mwarehouse").hide();
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
	$("#smoney").hide();
	$("#teo").hide();
	$("#ars").hide();
	$("#irs").hide();
	$("#fteout").hide();
	$("#fout").hide();
	$("#tematerial").hide();
	$("#mwarehouse").hide();
  });
  
  $("#if").click(function() {
	$("#in").show();
	$("#out").hide();
  });
  
  $("#of").click(function() {
	$("#out").show();
	$("#in").hide();
  });

  
  $("#departmentname").change(function() {
	  $("#empname").html("");
	  var departmentname = $(this).val();
	 $.ajax(
			  {

				  type: 'POST',
				  url: "getEmps!getEmps",
				dataType: 'json',
				  data:"department.departmentname="+departmentname,
				success: function (data) {
					  for(var i=0;i<data.length;i++){
						  $("#empname").append(
						            "<option value="+data[i]["empName"]+">"+data[i]["empName"]+"</option>"   			
								);
					  }		
				  	}
				  }
			  );
  });

});