package cn.bdqn.j25.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.service.OrdersService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class WarehouseAction extends ActionSupport {
	
	private OrdersService ordersService;
	private Orders orders;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	public OrdersService getOrdersService() {
		return ordersService;
	}

	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}

	public String findAllOrder() {
		System.out.println("findAllOrder()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		List<Orders> allOut = ordersService.findAllByPage(1, 5);
		int countNo = 0;
		if(ordersService.countAll()%5 != 0){
			countNo = ordersService.countAll()/5+1;
		}else if(ordersService.countAll()%5 == 0){
			countNo = ordersService.countAll()/5;
		}
		Map<String, Object> request = (Map) ActionContext.getContext().get("request");
		request.put("allOut", allOut);
		request.put("countNo", countNo);
		request.put("nowpageno", 1);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>findAllOrder()Stop");
		return SUCCESS;
		
	}
	
	public String changePageNo(){
		System.out.println("changePageNo()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Map<String, Object> requests = (Map) ActionContext.getContext().get("request");
		HttpServletRequest request = ServletActionContext.getRequest();
		String changeno = request.getParameter("changeno");
		int nowpageno = Integer.parseInt(request.getParameter("nowpageno"));
		int maxno = 5;
		int countNo = 0;
		if(ordersService.countAll()%5 != 0){
			countNo = ordersService.countAll()/5+1;
		}else if(ordersService.countAll()%5 == 0){
			countNo = ordersService.countAll()/5;
		}
		if(changeno.equals("first")){
			nowpageno = 1;
		}else if(changeno.equals("up")){
			nowpageno = nowpageno-1;
		}else if(changeno.equals("down")){
			nowpageno = nowpageno+1;
		}else if(changeno.equals("last")){
			nowpageno = countNo;
		}
		List<Orders> allOut = ordersService.findAllByPage(nowpageno, maxno);
		requests.put("allOut", allOut);
		requests.put("countNo", countNo);
		requests.put("nowpageno", nowpageno);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>changePageNo()Stop");
		return SUCCESS;
	}
	
	public String findOrderByOrdernumber() {
		System.out.println("findOrderByOrdernumber()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String ordernumber = request.getParameter("ordernumber");
		Orders order = ordersService.findByOrderno(ordernumber).get(0);
		Map<String, Object> requests = (Map) ActionContext.getContext().get("request");
		requests.put("order", order);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>findOrderByOrdernumber()Stop");
		return SUCCESS;
		
	}
}
