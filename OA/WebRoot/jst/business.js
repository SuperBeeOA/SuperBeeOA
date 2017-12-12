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
	  
	  $("#cg").click(function() {
		  $("#cgrder").show();
		  $("#aorder").hide();
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
	  
	//生成订单编号  
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
		  $(".cutomerNo").empty();
		  $.getJSON("order!findCustomer"," ",function(data){
			  var jsonObj=data;		
				$(jsonObj).each(function(){
					$(".cutomerNo").append(
			            "<option value="+this.customerid+">"+this.customername+"</option>"   			
					);
				});	
			  });
		  
		  $.getJSON("order1!findProduct"," ",function(data1){
			  $(".productid").empty();
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
			  			  
			  $(".unit").html(data.unit);
			  $(".productprice").html(data.productprice);
		  });
	  });
	  
	  //合计金额改变
	  
	  var num=$(".quantity").val();
	  var price=$(".productprice").html();
	  $(".totalprice").val(num*price);
	  
	  $(".quantity").blur(function() {
		  var num=$(".quantity").val();
		  var price=$(".productprice").html();
		  $(".totalprice").val(num*price);
	  });
	  
	  
	  //添加订单
	  $(".btn-primary").click(function(){
			var orderAdd=$("#orderAdd").serialize();
			$.get("order3!addOrder?employee.employeeid=1",orderAdd,callback,"text");
		});
	  function callback(data){
			if(data=="添加成功"){
				alert("添加成功");			
			}else{				
				 $(':input','#myform')
			       .not(':button,:submit,:reset,:hidden')//将myform表单中input元素type为button、submit、reset、hidden排除
			       .val('')  //将input元素的value设为空值
			       .removeAttr('checked')
			       .removeAttr('checked') // 如果任何radio/checkbox/select inputs有checked or selected 属性，将其移除
			}
			
		};
		
		//采购订单部分
		//生成采购订单编号  
		  $("#cg").click(function() {
			  var time = new Date();
			   // 程序计时的月从0开始取值后+1
			  var month = (time.getMonth() + 1).toString();
			  var year=time.getFullYear().toString();
			  var dat=time.getDate().toString();
			  var hour=time.getHours().toString();
			  var minute=time.getMinutes().toString();
			  var second=time.getSeconds().toString();
			  var buffer =year+month+dat+hour+minute+second;  
			  $(".Procurementnum").val(buffer);
			
		  });
		  //供应商、原料编号
		  $("#cg").click(function() {
			  $(".providerNo").empty();
			  $.getJSON("procurement!findProvider"," ",function(data){
				  var jsonObj=data;		
					$(jsonObj).each(function(){
						$(".providerNo").append(
				            "<option value="+this.providerid+">"+this.providername+"</option>"   			
						);
					});	
				  });
			  
			  $.getJSON("procurement1!findMaterial"," ",function(data1){
				  $(".materialid").empty();
				  	var json=data1;		
					$(json).each(function(){
						$(".materialid").append(
				            "<option value="+this.materialid+">"+this.materialname+"</option>"   			
						);
					});	
				  });		    
		  	});
		  //根据原料id查询单位和单价
		  
		  $(".materialid").change(function() {
			  var id= $(".materialid").val();
			  $.getJSON("procurement2!findprice","materialid="+id,function(data){				  			  
				  $(".Procurementunit").html(data.unit);
				  $(".Procurementprice").html(data.materialprice);
			  });
		  });
		  
		  //合计金额改变
		  
		  var num=$(".Procurementquantity").val();
		  var price=$(".Procurementprice").html();
		  $(".Procurementtotalprice").val(num*price);
		  
		  $(".Procurementquantity").blur(function() {
			  var num=$(".Procurementquantity").val();
			  var price=$(".Procurementprice").html();
			  $(".Procurementtotalprice").val(num*price);
		  });
		  
		  
		  //添加订单
		  $(".btn-primary1").click(function(){
				var orderAdd=$("#Procurement").serialize();
				$.get("procurement3!addProcurement?employee.employeeid=1",orderAdd,callback,"text");
			});
		  function callback(data){
				if(data=="添加成功"){
					alert("添加成功");			
				}else{				
					 $(':input','#myform')
				       .not(':button,:submit,:reset,:hidden')//将myform表单中input元素type为button、submit、reset、hidden排除
				       .val('')  //将input元素的value设为空值
				       .removeAttr('checked')
				       .removeAttr('checked') // 如果任何radio/checkbox/select inputs有checked or selected 属性，将其移除
				}
				
			};
			
		
});