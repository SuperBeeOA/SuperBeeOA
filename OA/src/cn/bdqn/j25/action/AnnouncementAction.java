package cn.bdqn.j25.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.bdqn.j25.pojo.Announcement;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.service.AnnouncementService;

public class AnnouncementAction extends ActionSupport{
	private Announcement announcement;
	private Employee employeeBySender;// 发
	private AnnouncementService announcementService;
	private State state;
	
	

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Announcement getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}

	public Employee getEmployeeBySender() {
		return employeeBySender;
	}

	public void setEmployeeBySender(Employee employeeBySender) {
		this.employeeBySender = employeeBySender;
	}

	public AnnouncementService getAnnouncementService() {
		return announcementService;
	}

	public void setAnnouncementService(AnnouncementService announcementService) {
		this.announcementService = announcementService;
	}
	
	
    public String addAnnouncement(){
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    	String date = df.format(new Date());
    	Timestamp ts = new Timestamp(System.currentTimeMillis());  
    	 ts = Timestamp.valueOf(date); 
    	 announcement.setTime(ts);
    	 announcement.setState(state);
    	 announcement.setEmployee(employeeBySender);
    	 announcement.setDepartment(employeeBySender.getDepartment());
    	 employeeBySender.getAnnouncements().add(employeeBySender);
    	 employeeBySender.getDepartment().getAnnouncements().add(announcement);
     	announcementService.addAnnouncement(announcement);
    	return SUCCESS;
    }
    public String finaByOpen(){
    	List<Announcement> listann=announcementService.findByOpen();
    	Map<String, Object> session = (Map) ActionContext.getContext().getSession();
    	session.put("listann", listann);
    	System.out.println(listann.size());
		return SUCCESS;	
    }
    public String findBydepartment(){
    	Employee employee=(Employee) ActionContext.getContext().getSession().get("employee");
    	String name=employee.getDepartment().getDepartmentname();
    	List<Announcement> listannbyname= announcementService.findBydepartment(name);
    	Map<String, Object> session = (Map) ActionContext.getContext().getSession();
    	session.put("listannbyment", listannbyname);
    	return SUCCESS;	
    }
    
}
