package cn.bdqn.j25.dao;


import java.util.List;

import cn.bdqn.j25.pojo.Orders;

public interface OrdersDao {
	public Orders findByid(int id);//根据ID查询	
	
	public List<Orders> findByOrderno(String orderno);//根据编号查询
	
	public List<Orders> findByPage(int firstResult,int maxResults);//根据时间降序分页展示全部
	 	
	public void delOrders(Orders orders); //删除
	
	public int countByTime(String date);//根据传入的时间统计订单量
	
	public void addOrders(Orders orders);//添加
	
	public void UpdateOrders(Orders orders);//更新信息
	
	public List<Orders> findAllOrderByState();//查询所有待审核的订单
}
