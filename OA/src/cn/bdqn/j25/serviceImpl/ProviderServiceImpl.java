package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.ProviderDao;
import cn.bdqn.j25.pojo.Provider;
import cn.bdqn.j25.service.ProviderService;

public class ProviderServiceImpl implements ProviderService {

	private ProviderDao providerDao;
	
	public ProviderDao getProviderDao() {
		return providerDao;
	}

	public void setProviderDao(ProviderDao providerDao) {
		this.providerDao = providerDao;
	}

	@Override
	public Provider findByid(int id) {
		// TODO Auto-generated method stub
		return providerDao.findByid(id);
	}

	@Override
	public List<Provider> findByName(String name) {
		// TODO Auto-generated method stub
		return providerDao.findByName(name);
	}

	@Override
	public List<Provider> findByPage(Provider provider, int first, int max) {
		// TODO Auto-generated method stub
		return providerDao.findByPage(provider, first, max);
	}

	@Override
	public Provider addOrUpdateProvider(Provider provider) {
		// TODO Auto-generated method stub
		return providerDao.addOrUpdateProvider(provider);
	}

	@Override
	public void delProvider(Provider provider) {
		// TODO Auto-generated method stub
		providerDao.delProvider(provider);
	}

	@Override
	public List<Provider> findAll() {
		// TODO Auto-generated method stub
		return providerDao.findAll();
	}

}
