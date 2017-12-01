package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.TypeDao;
import cn.bdqn.j25.pojo.Types;

public class TypeDaoImpl extends HibernateDaoSupport implements TypeDao {

	@Override
	public List<Types> findAll() {
		String hql = "from Types";
		return this.getHibernateTemplate().find(hql);

	}

}
