package cn.bdqn.j25.action;

import java.util.Map;

import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.service.EmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAndOutAction extends ActionSupport{
	private EmployeeService employeeService;
	private Employee employee;
	private String message;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	
	public String login(){
		Employee employee1=employeeService.findByWorkidPwd(employee).get(0);
		Map<String, Object> session =  ActionContext.getContext().getSession();
		System.out.println(employee1.getName());
		if(employee.getName()==null||employee.getName().equals("")){
			this.setMessage("登入失败，请检查用户名或密码");
			System.out.println("1111111111111111");
			return SUCCESS;
		}
		if(employee.getPassword()==null||employee.getPassword().equals("")){
			this.setMessage("登入失败，请检查用户名或密码");
			System.out.println("222222222222222222");
			return SUCCESS;
		}
		if(employee1==null){
			this.setMessage("登入失败，请检查用户名或密码");
			System.out.println("333333333333333333");
			return SUCCESS;
		}else{
			session.put("employee", employee1);
			System.out.println("----------");
			return SUCCESS;
		}
		
		
	}
	
	

}
