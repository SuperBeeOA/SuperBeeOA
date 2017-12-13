$(function() {
	$("#tei").click(function() {
		$("#tein").show();
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
		$("#tein").hide();
		$("#tematerial").hide();
		$("#mwarehouse").hide();
	});

	$("#tem").click(function() {
		$("#tematerial").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fout").hide();
		$("#tein").hide();
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
		$("#tein").hide();
	});
	
	$("#ftein").click(function() {
		$("#teins").show();
		$("#alltein").hide();
	});
	
	$("#btei").click(function() {
		$("#alltein").show();
		$("#teins").hide();
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
});