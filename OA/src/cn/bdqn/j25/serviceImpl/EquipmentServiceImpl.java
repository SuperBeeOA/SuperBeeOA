package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.EquipmentDao;
import cn.bdqn.j25.pojo.Equipment;
import cn.bdqn.j25.service.EquipmentService;

public class EquipmentServiceImpl implements EquipmentService {
	
	private EquipmentDao equipmentDao;

	public EquipmentDao getEquipmentDao() {
		return equipmentDao;
	}

	public void setEquipmentDao(EquipmentDao equipmentDao) {
		this.equipmentDao = equipmentDao;
	}

	@Override
	public List<Equipment> findAll() {
		// TODO Auto-generated method stub
		return equipmentDao.findAll();
	}

	@Override
	public List<Equipment> findByOutOrIn(String out, Equipment equipment,
			int first, int max) {
		// TODO Auto-generated method stub
		return equipmentDao.findByOutOrIn(out, equipment, first, max);
	}

	@Override
	public Equipment addOrUpdateEnter(Equipment equipment) {
		// TODO Auto-generated method stub
		return equipmentDao.addOrUpdateEnter(equipment);
	}

	@Override
	public boolean delEnter(Equipment equipment) {
		// TODO Auto-generated method stub
		boolean flag=false;
		equipmentDao.delEnter(equipment);
		if(equipmentDao.findByid(equipment.getEquipmentid().intValue())==null){
			flag=true;
		}
        return flag;
	}

	@Override
	public Equipment findByid(int id) {
		// TODO Auto-generated method stub
		return equipmentDao.findByid(id);
	}

}
