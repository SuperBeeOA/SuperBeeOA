package cn.bdqn.j25.action;


import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import cn.bdqn.j25.pojo.Customer;
import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.Product;
import cn.bdqn.j25.service.CustomerService;
import cn.bdqn.j25.service.OrdersService;
import cn.bdqn.j25.service.ProductService;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport{

	private OrdersService ordersService;
	private Orders orders;
	private Customer customer;
	private CustomerService customerService;
	private List<Customer> listCustomer;
	private List<Product> listProduct;
	private ProductService productService;
	private Product product;
	@SuppressWarnings("unchecked")
	private Map<String, Object> request = (Map) ActionContext.getContext().get(
			"request");
	
	private String productid;
	private String result;
	
	//自动生成客户编号
	public String findCustomer() throws UnsupportedEncodingException{
		listCustomer=customerService.findAll();
		System.out.println(listCustomer);
		for (Customer c : listCustomer) {
			c.getCustomerid();
			c.getCustomername();
		}
		return SUCCESS;		
	}
	//自动生成产品编号
	public String findProduct() throws UnsupportedEncodingException{
		listProduct=productService.findAll();		 
		return SUCCESS;		
	}
	
	//查询单价和单位
	
	public String findprice(){
		product=productService.findByid(Integer.parseInt(productid));
		result=JSONObject.toJSONString(product);
		
//		request.put("po", product);
//		System.out.println(listProduct);
		return SUCCESS;
	}
	
	
	
	public OrdersService getOrdersService() {
		return ordersService;
	}


	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}


	public Orders getOrders() {
		return orders;
	}


	public void setOrders(Orders orders) {
		this.orders = orders;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public CustomerService getCustomerService() {
		return customerService;
	}


	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}

	public Map<String, Object> getRequest() {
		return request;
	}


	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String getProductid() {
		return productid;
	}
	
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
