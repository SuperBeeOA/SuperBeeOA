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
	
	  
	  
	  
	  
//		$("#examine").click(function(){
//			var id=$(this).siblings(".orderid").text();
//			$.get("order5!pass",{"orders.orderid":id,"state.stateid":2},function(date){
//				if(date=="审核成功"){
//					alert("审核成功");
//					$(".table-bordered").load("order4!findOrder","first=1");
//				}
//				if(date=="审核失败"){
//					alert("审核失败");
//				}
//			});
//						
//		}); 
});