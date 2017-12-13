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
	
	$("#fin").click(function() {
		$("#in").show();
		$("#allin").hide();
	});
	
	$("#bi").click(function() {
		$("#allin").show();
		$("#in").hide();
	});
});