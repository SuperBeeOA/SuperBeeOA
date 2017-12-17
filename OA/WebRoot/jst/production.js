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
		//审核订单
		  var id=$(this).parents().siblings(".thisorderid").text();
		  $("#order").load("order10!findByID","orders.orderid="+id);
		
		  
	  });

	  $("#bo").click(function() {
		  $("#allorder").show();
		  $("#order").hide();
		  $("#allorder").load("order9!findAllOrders");
	  });
	  
	 //查询所有待审核的订单 
	  $("#te").click(function(){
		  $("#allorder").load("order9!findAllOrders");
	  });
	
	//通过
	  $("#yes").click(function(){
		  var id1=$(this).siblings("#waitpassid").val();
//		  alert(id1);
		  $.get("order5!pass",{"orders.orderid":id1,"state.stateid":3},function(date){
				if(date=="审核成功"){
					alert("审核成功");
				}
				if(date=="审核失败"){
					alert("审核失败");
				}
			});
	  });
	//驳回  
	
	  
	  
	//查看生产订单
	 $("#ar").click(function(){
		$("#ars").load("order13!findOrdersByfinance"); 
	 });
	  
	//生产任务单生成
	 $("#downorder").click(function(){
		 var date=$("#productOrder").serialize();
		 $(':input','#orderAdd')    
		 .not(':button, :submit, :reset, :hidden')    
		 .val(' ')    
		 .removeAttr('checked')    
		 .removeAttr('selected');
		 $.post("order15！addProOrders",date,function(date){
			 if(date=="添加成功"){
				 alert("添加成功");
			 }else{
				 alert("添加失败");				
			 }
						 
		 });
		 
	 });	
});