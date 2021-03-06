package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.MonitoringDao;
import cn.bdqn.j25.pojo.Monitoring;

public class MonitoringDaoImpl extends HibernateDaoSupport implements
		MonitoringDao {

	@Override
	public Monitoring findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Monitoring.class, id);
	}

	@Override
	public List<Monitoring> findByOrders(String orderno) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Monitoring where orders.orderno=?", orderno);
	}

	@Override
	public List<Monitoring> findByPage(Monitoring monitoring, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(monitoring, first, max);
	}

	@Override
	public Monitoring addOrUpdateMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(monitoring);
	}

	@Override
	public void delMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(monitoring);
	}

}
