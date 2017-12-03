package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.EquipmentDao;
import cn.bdqn.j25.pojo.Equipment;

public class EquipmentDaoImpl extends HibernateDaoSupport implements EquipmentDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Equipment> findByOutOrIn(String out, Equipment equipment,
			int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(out, equipment, first, max);
	}

	@Override
	public Equipment addOrUpdateEnter(Equipment equipment) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(equipment);
	}

	@Override
	public void delEnter(Equipment equipment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(equipment);
	}

	@Override
	public Equipment findByid(int id) {
		// TODO Auto-generated method stub
		return (Equipment) this.getHibernateTemplate().find("from Equipment where equipmentid=?", id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Equipment> findAll() {
		// TODO Auto-generated method stub
		String hql = "from Equipment";
		return this.getHibernateTemplate().find(hql);
	}

}
