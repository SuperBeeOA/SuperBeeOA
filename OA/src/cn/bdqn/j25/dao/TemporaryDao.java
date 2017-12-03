package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Temporary;

public interface TemporaryDao {
	public List<Temporary> finaAll();// 查询所有零时工

	public List<Temporary> finaByName(Temporary temporary);// 按名字查询临时工

	public Temporary addOrUpdetaTemporary(Temporary temporary);// 增加或修改零时工

	public void delTemporary(Temporary temporary);// 删除零时工

	public Temporary finaMoneyByName(String name);// 根据名字查询临时工工资
}
