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

	@Override
	public Types addOrUpdateType(Types types) {
		// TODO Auto-generated method stub
		return typeDao.addOrUpdateType(types);
	}

	@Override
	public Boolean delType(Types types) {
		// TODO Auto-generated method stub
		Boolean b=false;
		if(this.findByid(types.getTypeid().intValue())!=null){
			typeDao.delType(types);
			b=true;
			return b;
		}
		return b;
		
	}

	@Override
	public Types findByid(int id) {
		// TODO Auto-generated method stub
		return typeDao.findByid(id);
	}

}
