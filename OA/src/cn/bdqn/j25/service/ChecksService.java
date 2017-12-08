package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Checks;

public interface ChecksService {

	public List<Checks> findAll();
	
	public void mergeChecks(Checks checks);
	
	public List<Checks> findChecksById(int checkId);
	
	public List<Object[]> findChecksByEmployeeId(int employeeId);
	
	public List<Object[]> findChecksByProorderId(int proorderId);
}
