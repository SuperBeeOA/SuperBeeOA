package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.TypeDao;
import cn.bdqn.j25.pojo.Types;
import cn.bdqn.j25.service.TypeService;

public class TypeServiceImpl implements TypeService {

	private TypeDao typeDao;

	public TypeDao getTypeDao() {
		return typeDao;
	}

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

	@Override
	public List<Types> findAll() {
		// TODO Auto-generated method stub
		return typeDao.findAll();
	}

}
