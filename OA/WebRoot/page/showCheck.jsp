<%@ page contentType="text/html;charset=GBK"%>  

<%@ page import="org.jfree.chart.*,org.jfree.chart.plot.PiePlot,org.jfree.chart.title.TextTitle,org.jfree.chart.labels.*,  
org.jfree.data.general.DefaultPieDataset,org.jfree.chart.servlet.ServletUtilities,java.awt.*,java.text.NumberFormat"%>  
<%
Integer qualifiedrate = Integer.parseInt((String)request.getAttribute("qualifiedrate"));
Integer quantity = (Integer)request.getAttribute("quantity");
Integer qualified = (qualifiedrate*quantity)/100;
String reasons = (String)request.getAttribute("reasons");
DefaultPieDataset dataset = new DefaultPieDataset();  
dataset.setValue("合格", qualified);  
dataset.setValue("不合格", quantity-qualified);  
JFreeChart chart = ChartFactory.createPieChart("产品合格率", dataset, true, true, false);  
chart.getTitle().setFont(new Font("黑体",Font.BOLD,20));
PiePlot piePlot= (PiePlot) chart.getPlot();
piePlot.setLabelFont(new Font("黑体",Font.BOLD,10));
chart.getLegend().setItemFont(new Font("黑体",Font.BOLD,10));
chart.addSubtitle(new TextTitle("不合格原因："+reasons));
PiePlot pieplot = (PiePlot)chart.getPlot();
pieplot.setLabelFont(new Font("宋体", 0, 11));
pieplot.setCircular(true);  
StandardPieSectionLabelGenerator standarPieIG = new StandardPieSectionLabelGenerator("{0}:({1},{2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance());  
pieplot.setLabelGenerator(standarPieIG);  
pieplot.setNoDataMessage("无数据显示");  
pieplot.setLabelGap(0.02D);  
String filename = ServletUtilities.saveChartAsPNG(chart, 500, 300, null, session);  
String graphURL = request.getContextPath() + "/DisplayChart?filename=" + filename;  
%>  
<img src="<%= graphURL %>" width=490 height=306 border=0 >