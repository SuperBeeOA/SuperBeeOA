package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Announcement;
import cn.bdqn.j25.pojo.Employee;

public interface AnnouncementDao {
	public List<Announcement> findAll();// 获得所有公开公告

	public List<Announcement> findByDepartment(String departmentid);// 获得该部门私密公告

	public Announcement addAnnouncement(Announcement announcement); // 添加公告

	public void delAnnouncement(String announcementid);// 删除公告

	public List<Announcement> findByDepartmentid(String announcementid );//根据ID查询公告;
	
	public List<Announcement> findByOpen();//查询公开公告
	
	
	public List<Announcement> findBydepartment(String depName);//查询部门内部公告
}
