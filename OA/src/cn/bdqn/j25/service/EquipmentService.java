package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Equipment;

public interface EquipmentService {

	public List<Equipment> findAll();//查询全部Equipment类信息

	public List<Equipment> findByOutOrIn(String out, Equipment equipment,int first, int max); //查询全部Equipment类信息（分页）
	
	public  Equipment addOrUpdateEnter(Equipment equipment); //增加或更新入库表
	
	public boolean delEnter(Equipment equipment); //删除入库表
	
	public Equipment findByid(int id);// 根据id查询
	
}
