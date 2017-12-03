package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.CustomerDao;
import cn.bdqn.j25.pojo.Customer;
import cn.bdqn.j25.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findByid(int id) {
		// TODO Auto-generated method stub
		return customerDao.findByid(id);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public List<Customer> findByCustomername(String customername) {
		// TODO Auto-generated method stub
		return customerDao.findByCustomername(customername);
	}

	@Override
	public List<Customer> findByContacts(String contacts) {
		// TODO Auto-generated method stub
		return customerDao.findByContacts(contacts);
	}

	@Override
	public List<Customer> findByPage(Customer customer, int first, int max) {
		// TODO Auto-generated method stub
		return customerDao.findByPage(customer, first, max);
	}

	@Override
	public List<Customer> findByLevel(String level) {
		// TODO Auto-generated method stub
		return customerDao.findByLevel(level);
	}

	@Override
	public Customer addOrUpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addOrUpdateCustomer(customer);
	}

	@Override
	public Boolean delCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Boolean b=false;
		if(this.findByid(customer.getCustomerid().intValue())!=null){
			customerDao.delCustomer(customer);
			b=true;
			return b;
		}
		return b;
	}

}