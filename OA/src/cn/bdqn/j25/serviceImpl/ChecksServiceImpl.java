package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.ChecksDao;
import cn.bdqn.j25.pojo.Checks;
import cn.bdqn.j25.service.ChecksService;

public class ChecksServiceImpl implements ChecksService {
	
	private ChecksDao checksDao;

	public ChecksDao getChecksDao() {
		return checksDao;
	}

	public void setChecksDao(ChecksDao checksDao) {
		this.checksDao = checksDao;
	}

	@Override
	public List<Checks> findAll() {
		// TODO Auto-generated method stub
		return checksDao.findAll();
	}

	@Override
	public void mergeChecks(Checks checks) {
		// TODO Auto-generated method stub
		checksDao.mergeChecks(checks);
	}

	@Override
	public List<Checks> findChecksById(int checkId) {
		// TODO Auto-generated method stub
		return checksDao.findChecksById(checkId);
	}

	@Override
	public List<Object[]> findChecksByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return checksDao.findChecksByEmployeeId(employeeId);
	}

	@Override
	public List<Object[]> findChecksByProorderId(int proorderId) {
		// TODO Auto-generated method stub
		return checksDao.findChecksByProorderId(proorderId);
	}

}
