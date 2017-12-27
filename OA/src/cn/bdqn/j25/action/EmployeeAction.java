package cn.bdqn.j25.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.bdqn.j25.pojo.Department;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.service.EmployeeService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	private EmployeeService employeeService;
	private Employee employee;
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	@SuppressWarnings("unchecked")
	private Map<String, Object> request = (Map) ActionContext.getContext().get(
			"request");

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	//添加
   public String  addemp() {
	    State state=new State();
   		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
   		String date = df.format(new Date());
   		Timestamp ts = new Timestamp(System.currentTimeMillis());  
   		ts = Timestamp.valueOf(date); 
   		employee.setEntrytime(ts);
   		employee.setPassword("123456");
   		employee.setResttime(0);
	    employeeService.addOrUpdateEmployee(employee);
	  
	   
	   return Action.SUCCESS;	
   }
   
   public String allemp(){
	   Employee emp = new Employee(); 
	     if(!employee.getWorkid().equals("") && employee.getWorkid()!= null){
	    	 emp.setWorkid(employee.getWorkid());
	     }
	     if(!employee.getName().equals("") && employee.getName()!= null){
	    	 emp.setName(employee.getName());
	     }
	     List<Employee> listemps= employeeService.findAll(emp);
	     Map<String, Object> session = (Map) ActionContext.getContext().getSession();
	     session.put("loademp", listemps);
	   
	   
	   
	   return Action.SUCCESS;
	   
   }
   
   //查询
   public String aemp(){
	   
	   Map<String, Object> requests = (Map<String, Object>) ActionContext.getContext().get("request");
	   HttpServletRequest request = ServletActionContext.getRequest();
	   String workid = request.getParameter("workid");
	   Employee employee = employeeService.findByWorkid(workid).get(0);	   
	   requests.put("empxg", employee);	   	   	   
	   return Action.SUCCESS;	   
   }
   
   
   public String updateEmp(){
	   
	   Map<String, Object> requests = (Map<String, Object>) ActionContext.getContext().get("request");
	   HttpServletRequest request = ServletActionContext.getRequest();
	   String workid = request.getParameter("workid");
	   Employee employees = employeeService.addOrUpdateEmployee(employee);	   
	   requests.put("empxg", employees);	   	   	   
	   return Action.SUCCESS;	   
   }
}
