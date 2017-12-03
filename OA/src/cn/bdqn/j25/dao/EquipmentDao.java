package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Equipment;

public interface EquipmentDao {
	
	public List<Equipment> findAll();//查询全部Equipment类信息

	public List<Equipment> findByOutOrIn(String out, Equipment equipment,int first, int max); //查询全部Equipment类信息（分页）
	
	public  Equipment addOrUpdateEnter(Equipment equipment); //增加或更新入库表
	
	public void delEnter(Equipment equipment); //删除入库表
	
	public Equipment findByid(int id);// 根据id查询
	
}
