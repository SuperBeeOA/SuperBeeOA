package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Warehouse;

public interface WarehouseService {

	public Warehouse findByid(int id);//根据ID查询	
	
	public List<Warehouse> findByPage(Warehouse warehouse,int first,int max);//分页展示全部
	 
	public Warehouse addOrUpdateOut(Warehouse warehouse);//增加或更新信息
	
	public boolean delWarehouse(Warehouse warehouse); //删除
	
}
