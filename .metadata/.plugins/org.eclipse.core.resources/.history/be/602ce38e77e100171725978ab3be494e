package cn.bdqn.j25.service;

import java.util.Date;
import java.util.List;

import cn.bdqn.j25.pojo.Orders;

public interface OrdersService {
	public Orders findByid(int id);//根据ID查询	
	
	public List<Orders> findByOrderno(String orderno);//根据编号查询
	
	public List<Orders> findByPage(int firstResult,int maxResults);//根据时间降序分页展示全部
	 
	public boolean UpdateOrders(Orders orders);//更新信息
	
	public void delOrders(Orders orders); //删除
	
	public int countByTime(String date);//根据传入的时间统计订单量
	
	public boolean addOrders(Orders orders);//添加
}
