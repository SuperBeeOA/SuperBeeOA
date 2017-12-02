package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Announcement;

public interface AnnouncementDao {
	public List<Announcement> findAll();//获得所有公开公告
    public List<Announcement> findByDepartment(String departmentid);//获得该部门私密公告
    public int addAnnouncement(); //添加公告
    public int delAnnouncement();//删除公告

}
