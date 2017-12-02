package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.AnnouncementDao;
import cn.bdqn.j25.pojo.Announcement;

public class AnnouncementDaoImpl extends HibernateDaoSupport implements AnnouncementDao {

	@Override
	public List<Announcement> findAll() {
		
		return this.getHibernateTemplate().find("from ANNOUNCEMENT where TYPEID= 1");
	}

	@Override
	public List<Announcement> findByDepartment(String departmentid) {
		
		return this.getHibernateTemplate().find("from ANNOUNCEMENT where DEPARTMENTID=?",departmentid);
	}

	@Override
	public int addAnnouncement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delAnnouncement() {
		// TODO Auto-generated method stub
		return 0;
	}

}
