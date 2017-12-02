package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Enter;

public interface EnterDao {

	public List<Enter> findByOutOrIn(String out, Enter enter,int first, int max); //查询全部Enter类信息
	
	public  Enter addOrUpdateEnter(Enter enter); //增加或更新入库表
	
	public void delEnter(Enter enter); //删除入库表
	
	public Enter findByid(int id);// 根据id查询
	
}
