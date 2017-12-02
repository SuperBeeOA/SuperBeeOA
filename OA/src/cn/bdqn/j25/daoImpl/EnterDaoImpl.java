package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.EnterDao;
import cn.bdqn.j25.pojo.Enter;

public class EnterDaoImpl extends HibernateDaoSupport implements EnterDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Enter> findByOutOrIn(String out, Enter enter,int first, int max) {
		return this.getHibernateTemplate().findByExample(out, enter, first, max);
	}

	@Override
	public Enter addOrUpdateEnter(Enter enter) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(enter);
	}

	@Override
	public void delEnter(Enter enter) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(enter);
	}

	@Override
	public Enter findByid(int id) {
		// TODO Auto-generated method stub
		return (Enter) this.getHibernateTemplate().find("from Enter where enterid=?",id);
	}

}
