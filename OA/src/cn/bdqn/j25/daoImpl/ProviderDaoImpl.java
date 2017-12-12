package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ProviderDao;
import cn.bdqn.j25.pojo.Provider;

public class ProviderDaoImpl extends HibernateDaoSupport implements ProviderDao {

	@Override
	public Provider findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Provider.class, id);
	}

	@Override
	public List<Provider> findByName(String name) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Provider where providername =?", name);
	}

	@Override
	public List<Provider> findByPage(Provider provider, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(provider, first, max);
	}

	@Override
	public Provider addOrUpdateProvider(Provider provider) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(provider);
	}

	@Override
	public void delProvider(Provider provider) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(provider);
	}

	@Override
	public List<Provider> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("select new Provider(providerid,providername) from Provider");
	}

}
