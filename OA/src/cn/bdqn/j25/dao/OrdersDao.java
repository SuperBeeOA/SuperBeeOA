package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Orders;

public interface OrdersDao {
	public Orders findByid(int id);//根据ID查询	
	
	public List<Orders> findByOrderno(String orderno);//根据编号查询
	
	public List<Orders> findByPage(Orders orders,int first,int max);//分页展示全部
	 
	public Orders addOrUpdateOrders(Orders orders);//增加或更新信息
	
	public void delOrders(Orders orders); //删除
}
