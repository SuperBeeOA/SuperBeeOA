package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.OrdersDao;
import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {

	private OrdersDao ordersDao;
	public OrdersDao getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	public Orders findByid(int id) {
		// TODO Auto-generated method stub
		return ordersDao.findByid(id);
	}

	@Override
	public List<Orders> findByOrderno(String orderno) {
		// TODO Auto-generated method stub
		return ordersDao.findByOrderno(orderno);
	}

	@Override
	public List<Orders> findByPage(Orders orders, int first, int max) {
		// TODO Auto-generated method stub
		return ordersDao.findByPage(orders, first, max);
	}

	@Override
	public Orders addOrUpdateOrders(Orders orders) {
		// TODO Auto-generated method stub
		return ordersDao.addOrUpdateOrders(orders);
	}

	@Override
	public Boolean delOrders(Orders orders) {
		// TODO Auto-generated method stub
		Boolean b=false;
		if(this.findByid(orders.getOrderid().intValue())!=null){
			ordersDao.delOrders(orders);
			b=true;
			return b;
		}
		return b;
	}

}