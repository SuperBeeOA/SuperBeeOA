$(function() {
	$("#teout").click(function() {
		$("#allteout").load("findallorder.action");
		$("#fteout").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fout").hide();
		$("#tematerial").hide();
		$("#mwarehouse").hide();
	});

	$("#fo").click(function() {
		$("#allout").load("findallorder.action");
		$("#fout").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fteout").hide();
		$("#tematerial").hide();
		$("#mwarehouse").hide();
	});

	$("#tem").click(function() {
		$("#alltematerial").load("findallprocurement.action");
		$("#tematerial").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fout").hide();
		$("#fteout").hide();
		$("#mwarehouse").hide();
	});

	$("#mwh").click(function() {
		$("#mwarehouse").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fout").hide();
		$("#tematerial").hide();
		$("#fteout").hide();
	});
	
	$(".gout").click(function() {
		var ordernumber = $(this).prev().val();
		$("#faout").load("findorderbyordernumber.action","ordernumber="+ordernumber);
		$("#faout").show();
		$("#allout").hide();
	});
	
	$("#bout").click(function() {
		$("#allout").show();
		$("#faout").hide();
	});

	//allProductin.jsp翻页
	var allProductin = "allProductin";
	
	$("#allteout-first").click(function() {
		var nowpageno = $("#allteout-nowpageno").text();
		$("#allteout").load("changepageno.action",{"changeno":"first","nowpageno":nowpageno,"page":allProductin});
	});
	
	$("#allteout-up").click(function() {
		var nowpageno = $("#allteout-nowpageno").text();
		$("#allteout").load("changepageno.action",{"changeno":"up","nowpageno":nowpageno,"page":allProductin});
	});
	
	$("#allteout-down").click(function() {
		var nowpageno = $("#allteout-nowpageno").text();
		$("#allteout").load("changepageno.action",{"changeno":"down","nowpageno":nowpageno,"page":allProductin});
	});
	
	$("#allteout-last").click(function() {
		var nowpageno = $("#allteout-nowpageno").text();
		$("#allteout").load("changepageno.action",{"changeno":"last","nowpageno":nowpageno,"page":allProductin});
	});
	
	//allProductin.jsp查看详情
	$("#gteout").click(function() {
		var ordernumber = $(this).prev().val();
		$("#teouts").load("findorderbyordernumber.action","ordernumber="+ordernumber);
		$("#teouts").show();
		$("#allteout").hide();
	});
	
	$("#bteo").click(function() {
		$("#allteout").show();
		$("#teouts").hide();
	});
	
	$("#tematerial-first").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"first","nowpageno":nowpageno});
	});
	
	$("#tematerial-up").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"up","nowpageno":nowpageno});
	});
	
	$("#tematerial-down").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"down","nowpageno":nowpageno});
	});
	
	$("#tematerial-last").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"last","nowpageno":nowpageno});
	});
});