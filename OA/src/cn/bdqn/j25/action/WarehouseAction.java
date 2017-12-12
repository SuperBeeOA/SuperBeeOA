package cn.bdqn.j25.action;

import cn.bdqn.j25.pojo.Orders;

import com.opensymphony.xwork2.ActionSupport;

public class WarehouseAction extends ActionSupport {
	
	private Orders orders;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	
}
