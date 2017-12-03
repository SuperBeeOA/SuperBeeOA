package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.WorkshopDao;
import cn.bdqn.j25.pojo.Workshop;
import cn.bdqn.j25.service.WorkshopService;

public class WorkshopServiceImpl implements WorkshopService {

	private WorkshopDao workshopDao;
	
	public WorkshopDao getWorkshopDao() {
		return workshopDao;
	}

	public void setWorkshopDao(WorkshopDao workshopDao) {
		this.workshopDao = workshopDao;
	}

	@Override
	public Workshop findByid(int id) {
		// TODO Auto-generated method stub
		return workshopDao.findByid(id);
	}

	@Override
	public List<Workshop> findAll() {
		// TODO Auto-generated method stub
		return workshopDao.findAll();
	}

	@Override
	public Workshop addOrUpdateWorkshop(Workshop workshop) {
		// TODO Auto-generated method stub
		return workshopDao.addOrUpdateWorkshop(workshop);
	}

	@Override
	public Boolean delWorkshop(Workshop workshop) {
		// TODO Auto-generated method stub
		Boolean b=false;
		if(this.findByid(workshop.getWorkshopid().intValue())!=null){
			workshopDao.delWorkshop(workshop);
			b=true;
			return b;
		}
		return b;
	}

}
