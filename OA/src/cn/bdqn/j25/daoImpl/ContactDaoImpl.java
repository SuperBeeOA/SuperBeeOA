package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ContactDao;
import cn.bdqn.j25.pojo.Contact;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.State;

public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao {

	@Override
	public List<Contact> finaAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Contact");
	}

	@Override
	public List<Contact> finaCantactById(String id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Contact where contactid=?",id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> finaCantecByRecipient(String empname) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Contact where employeeByRecipient.name=?",empname);
	}

	@Override
	public List<Contact> finaantactBySender(String name) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Contact c where  c.employeeBySender.name=?",name);
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		  this.getHibernateTemplate().save(contact);
		  return null;
	}

}
