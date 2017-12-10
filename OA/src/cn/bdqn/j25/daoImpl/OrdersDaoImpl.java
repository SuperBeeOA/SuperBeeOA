package cn.bdqn.j25.daoImpl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.OrdersDao;
import cn.bdqn.j25.pojo.Orders;

public class OrdersDaoImpl extends HibernateDaoSupport implements OrdersDao {

	@Override
	public Orders findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orders.class, id);
	}

	@Override
	public List<Orders> findByOrderno(String orderno) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Orders where orderno =?", orderno);
	}

	@Override
	public List<Orders> findByPage(Orders orders, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(orders, first, max);
	}

	@Override
	public Orders addOrUpdateOrders(Orders orders) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(orders);
	}

	@Override
	public void delOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(orders);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int countByTime(final String date) {
		// TODO Auto-generated method stub
		
		String hql ="select count(*) from orders t where t.datetime = to_date('?','yyyy-mm-dd')";
		return this.getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {				
			Query query = session.createQuery("select count(1) from orders where datetime = to_date('?','yyyy-mm-dd')");
			return Integer.parseInt(query.setString(1, date).uniqueResult().toString());
			}
		});
	}

	@Override
	public void addOrders(Orders orders) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(orders);
	}

}
