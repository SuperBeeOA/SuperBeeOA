<%@ page contentType="text/html;charset=GBK"%>  

<%@ page import="org.jfree.chart.*,org.jfree.chart.plot.PiePlot,org.jfree.chart.title.TextTitle,org.jfree.chart.labels.*,  
org.jfree.data.general.DefaultPieDataset,org.jfree.chart.servlet.ServletUtilities,java.awt.*,java.text.NumberFormat"%>  
<%
Integer qualifiedrate = Integer.parseInt((String)request.getAttribute("qualifiedrate"));
Integer quantity = (Integer)request.getAttribute("quantity");
Integer qualified = (qualifiedrate*quantity)/100;
String reasons = (String)request.getAttribute("reasons");
DefaultPieDataset dataset = new DefaultPieDataset();  
dataset.setValue("�ϸ�", qualified);  
dataset.setValue("���ϸ�", quantity-qualified);  
JFreeChart chart = ChartFactory.createPieChart("��Ʒ�ϸ���", dataset, true, true, false);  
chart.getTitle().setFont(new Font("����",Font.BOLD,20));
PiePlot piePlot= (PiePlot) chart.getPlot();
piePlot.setLabelFont(new Font("����",Font.BOLD,10));
chart.getLegend().setItemFont(new Font("����",Font.BOLD,10));
chart.addSubtitle(new TextTitle("���ϸ�ԭ��"+reasons));
PiePlot pieplot = (PiePlot)chart.getPlot();
pieplot.setLabelFont(new Font("����", 0, 11));
pieplot.setCircular(true);  
StandardPieSectionLabelGenerator standarPieIG = new StandardPieSectionLabelGenerator("{0}:({1},{2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance());  
pieplot.setLabelGenerator(standarPieIG);  
pieplot.setNoDataMessage("��������ʾ");  
pieplot.setLabelGap(0.02D);  
String filename = ServletUtilities.saveChartAsPNG(chart, 500, 300, null, session);  
String graphURL = request.getContextPath() + "/DisplayChart?filename=" + filename;  
%>  
<img src="<%= graphURL %>" width=490 height=306 border=0 >