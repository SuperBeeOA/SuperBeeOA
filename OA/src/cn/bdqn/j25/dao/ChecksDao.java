package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Checks;

public interface ChecksDao {

	public List<Checks> findAll();
	
	public void mergeChecks(Checks checks);
	
	public List<Checks> findChecksById(int checkId);
	
	public List<Object[]> findChecksByEmployeeId(int employeeId);
	
	public List<Object[]> findChecksByProorderId(int proorderId);

	
}
