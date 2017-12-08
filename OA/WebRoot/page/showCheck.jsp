<%@ page contentType="text/html;charset=GBK"%>  

<%@ page import="org.jfree.chart.*,org.jfree.chart.plot.PiePlot,org.jfree.chart.title.TextTitle,org.jfree.chart.labels.*,  
org.jfree.data.general.DefaultPieDataset,org.jfree.chart.servlet.ServletUtilities,java.awt.*,java.text.NumberFormat"%>  
<%
Integer qualifiedrate = Integer.parseInt((String)request.getAttribute("qualifiedrate"));
Integer quantity = (Integer)request.getAttribute("quantity");
Integer qualified = (qualifiedrate*quantity)/100;
String reasons = (String)request.getAttribute("reasons");
//���ñ�ͼ���ݼ�  
DefaultPieDataset dataset = new DefaultPieDataset();  
dataset.setValue("�ϸ�", qualified);  
dataset.setValue("���ϸ�", quantity-qualified);  
  
//ͨ������������JFreeChart����  
JFreeChart chart = ChartFactory.createPieChart("��Ʒ�ϸ���", dataset, true, true, false);  
/*���������쳣�������*/ 
    chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
    PiePlot piePlot= (PiePlot) chart.getPlot();//��ȡͼ���������
    piePlot.setLabelFont(new Font("����",Font.BOLD,10));
    chart.getLegend().setItemFont(new Font("����",Font.BOLD,10));
//�Ӹ�������  
	chart.addSubtitle(new TextTitle("���ϸ�ԭ��"+reasons));
 /*���������쳣�������*/
PiePlot pieplot = (PiePlot)chart.getPlot();
  
// PiePlot pieplot = (PiePlot) chart.getPlot();  
pieplot.setLabelFont(new Font("����", 0, 11));
//���ñ�ͼ��Բ�ģ�true����������Բ�ģ�false����Ĭ��Ϊtrue  
pieplot.setCircular(true);  
StandardPieSectionLabelGenerator standarPieIG = new StandardPieSectionLabelGenerator("{0}:({1},{2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance());  
pieplot.setLabelGenerator(standarPieIG);  
  
//û�����ݵ�ʱ����ʾ������  
pieplot.setNoDataMessage("��������ʾ");  
pieplot.setLabelGap(0.02D);  
  
String filename = ServletUtilities.saveChartAsPNG(chart, 500, 300, null, session);  
String graphURL = request.getContextPath() + "/DisplayChart?filename=" + filename;  
%>  
<img src="<%= graphURL %>" width=490 height=306 border=0 >