package cn.bdqn.j25.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.Procurement;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.service.OrdersService;
import cn.bdqn.j25.service.ProcurementService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class WarehouseAction extends ActionSupport {
	
	private OrdersService ordersService;
	private Orders orders;
	private ProcurementService procurementService;
	private Procurement procurement;
	
	public ProcurementService getProcurementService() {
		return procurementService;
	}

	public void setProcurementService(ProcurementService procurementService) {
		this.procurementService = procurementService;
	}

	public Procurement getProcurement() {
		return procurement;
	}

	public void setProcurement(Procurement procurement) {
		this.procurement = procurement;
	}

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


	/*public String findAllOrder() {
		System.out.println("Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Orders> allOut = ordersService.findAllByPage(1, 10);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+allOut.get(0).getOrdernumber());
		Map<String, Object> request = (Map) ActionContext.getContext().get("request");
		request.put("allOut", allOut);
		Map<String, Object> session = (Map) ActionContext.getContext().getSession();
		session.put("allOut", allOut);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Stop");
		return SUCCESS;
		
	}*/

	
	//翻页
	@SuppressWarnings("unchecked")
	public String changePageNo(){
		System.out.println("changePageNo()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Map<String, Object> requests = (Map<String, Object>) ActionContext.getContext().get("request");
		HttpServletRequest request = ServletActionContext.getRequest();
		String changeno = request.getParameter("changeno");
		String page = request.getParameter("page");
		int nowpageno = Integer.parseInt(request.getParameter("nowpageno"));
		int maxno = 5;
		int countNo = 0;
		if(changeno.equals("first")){
			nowpageno = 1;
		}else if(changeno.equals("up")){
			nowpageno = nowpageno-1;
		}else if(changeno.equals("down")){
			nowpageno = nowpageno+1;
		}else if(changeno.equals("last")){
			nowpageno = countNo;
		}
		if(page.equals("allProductin")){
			int infono = ordersService.countAll();
			if(infono%5 != 0){
				countNo = infono/5+1;
			}else if(infono%5 == 0){
				countNo = infono/5;
			}
			List<Orders> allteout = ordersService.findAllByPage(nowpageno, maxno);
			requests.put("allteout", allteout);
			requests.put("countNo", countNo);
			requests.put("nowpageno", nowpageno);
			return "allProductin";
		}
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>changePageNo()Stop");
		return ERROR;
	}
	
	
	//查看产品出库申请功能
	//查找所有需审核订单
	@SuppressWarnings("unchecked")
	public String findAllOrder() {
		System.out.println("findAllOrder()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		List<Orders> allteout = ordersService.findAllByPage(1, 5);
		int infono = ordersService.countAll();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+infono);
		int countNo = 0;
		if(infono%5 != 0){
			countNo = infono/5+1;
		}else if(infono%5 == 0){
			countNo = infono/5;
		}
		Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("allteout", allteout);
		request.put("countNo", countNo);
		request.put("nowpageno", 1);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>findAllOrder()Stop");
		return SUCCESS;
		
	}
	
	//根据订单编号查找订单信息
	@SuppressWarnings("unchecked")
	public String findOrderByOrdernumber() {
		System.out.println("findOrderByOrdernumber()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String ordernumber = request.getParameter("ordernumber");
		Orders order = ordersService.findByOrderno(ordernumber).get(0);
		Map<String, Object> requests = (Map<String, Object>) ActionContext.getContext().get("request");
		requests.put("order", order);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>findOrderByOrdernumber()Stop");
		return SUCCESS;
		
	}
	//审核原材料申请功能
	
	@SuppressWarnings("unchecked")
	public String findAllProcurement() {
		System.out.println("findAllProcurement()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		List<Procurement> allTematerial = procurementService.findAllByPage(1, 5);
		int infono = procurementService.countAll();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+infono);
		int countNo = 0;
		if(infono%5 != 0){
			countNo = infono/5+1;
		}else if(infono%5 == 0){
			countNo = infono/5;
		}
		Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("allTematerial", allTematerial);
		request.put("countNo", countNo);
		request.put("nowpageno", 1);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>findAllProcurement()Stop");
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String changeTematerialPageNo() {
		System.out.println("changeTematerialPageNo()Start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Map<String, Object> requests = (Map<String, Object>) ActionContext.getContext().get("request");
		HttpServletRequest request = ServletActionContext.getRequest();
		String changeno = request.getParameter("changeno");
		int nowpageno = Integer.parseInt(request.getParameter("nowpageno"));
		int maxno = 5;
		int infono = procurementService.countAll();
		int countNo = 0;
		if(infono%5 != 0){
			countNo = infono/5+1;
		}else if(infono%5 == 0){
			countNo = infono/5;
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
		List<Procurement> allTematerial = procurementService.findAllByPage(nowpageno, maxno);
		requests.put("allTematerial", allTematerial);
		requests.put("countNo", countNo);
		requests.put("nowpageno", nowpageno);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>changeTematerialPageNo()Stop");
		return SUCCESS;
	}

}
