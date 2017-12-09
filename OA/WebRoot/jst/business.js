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
	  
	//生产订单编号  
	  $("#ao").click(function() {
		  var time = new Date();
		   // 程序计时的月从0开始取值后+1
		  var month = (time.getMonth() + 1).toString();
		  var year=time.getFullYear().toString();
		  var dat=time.getDate().toString();
		  var hour=time.getHours().toString();
		  var minute=time.getMinutes().toString();
		  var second=time.getSeconds().toString();
		  var buffer =year+month+dat+hour+minute+second;  
		  $(".orderno").val(buffer);
		
	  });
	  //客户、产品编号
	  $("#ao").click(function() {
		  $.getJSON("order!findCustomer"," ",function(data){
			  var jsonObj=data;		
				$(jsonObj).each(function(){
					$(".cutomerNo").append(
			            "<option value="+this.customerid+">"+this.customername+"</option>"   			
					);
				});	
			  });
		  
		  $.getJSON("order1!findProduct"," ",function(data1){
			  var json=data1;		
				$(json).each(function(){
					$(".productid").append(
			            "<option value="+this.productid+">"+this.productname+"</option>"   			
					);
				});	
			  });		    
	  	});
	  //根据产品id查询单位和单价
	  
	  $(".productid").change(function() {
		  var id= $(".productid").val();
		  $.getJSON("order2!findprice","productid="+id,function(data){
			  alert(data.types);			  
			  $(".unit").html(data.unit);
			  $(".productprice").html(data.productprice);
		  });
	  });
	  
	  //添加
});