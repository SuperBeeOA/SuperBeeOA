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
		System.out.println("Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Orders> allOut = ordersService.findAllByPage(1, 5);
		int countNo = 0;
		if(ordersService.countAll()%5 != 0){
			countNo = ordersService.countAll()/5+1;
		}else if(ordersService.countAll()%5 == 0){
			countNo = ordersService.countAll()/5;
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+allOut.get(0).getOrdernumber());
		Map<String, Object> request = (Map) ActionContext.getContext().get("request");
		request.put("allOut", allOut);
		request.put("countNo", countNo);
		/*Map<String, Object> session = (Map) ActionContext.getContext().getSession();
		session.put("allOut", allOut);*/
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Stop");
		return SUCCESS;
		
	}
	
	public String findOrderByOrdernumber() {
		System.out.println("Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String ordernumber = request.getParameter("ordernumber");
		Orders order = ordersService.findByOrderno(ordernumber).get(0);
		Map<String, Object> requests = (Map) ActionContext.getContext().get("request");
		requests.put("order", order);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Stop");
		return SUCCESS;
		
	}
}
