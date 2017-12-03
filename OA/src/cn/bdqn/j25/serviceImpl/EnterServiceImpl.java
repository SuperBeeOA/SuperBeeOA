package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.EnterDao;
import cn.bdqn.j25.pojo.Enter;
import cn.bdqn.j25.service.EnterService;

public class EnterServiceImpl implements EnterService {

	private EnterDao enterDao;
	
	public EnterDao getEnterDao() {
		return enterDao;
	}

	public void setEnterDao(EnterDao enterDao) {
		this.enterDao = enterDao;
	}

	@Override
	public Enter addOrUpdateEnter(Enter enter) {
		// TODO Auto-generated method stub
		return enterDao.addOrUpdateEnter(enter);
	}

	@Override
	public boolean delEnter(Enter enter) {
		// TODO Auto-generated method stub
		boolean flag=false;
		enterDao.delEnter(enter);
		if(enterDao.findByid(enter.getEnterid().intValue())==null){
			flag=true;
		}
        return flag;
	}

	@Override
	public List<Enter> findByOutOrIn(String out, Enter enter, int first, int max) {
		// TODO Auto-generated method stub
		return enterDao.findByOutOrIn(out, enter, first, max);
	}

	@Override
	public List<Enter> find() {
		// TODO Auto-generated method stub
		return enterDao.find();
	}

}
