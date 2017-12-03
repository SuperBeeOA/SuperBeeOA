package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.DepartmentDao;
import cn.bdqn.j25.pojo.Department;
import cn.bdqn.j25.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDao departmentDao;
	
	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public Department findByid(int id) {
		// TODO Auto-generated method stub
		return departmentDao.findByid(id);
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return departmentDao.findAll();
	}

	@Override
	public Department addOrUpdateDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.addOrUpdateDepartment(department);
	}

	@Override
	public Boolean delDepartment(Department department) {
		// TODO Auto-generated method stub
		Boolean b=false;
		if(this.findByid(department.getDepartmentid().intValue())!=null){
			departmentDao.delDepartment(department);
			b=true;
			return b;
		}
		return b;
	}

}
