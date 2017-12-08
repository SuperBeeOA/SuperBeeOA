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
	
	
	@SuppressWarnings({ "unused", "unchecked" })
	public String login(Employee employee){
		Employee employee1=(Employee) employeeService.findByWorkidPwd(employee);
		Map<String, Object> request = (Map) ActionContext.getContext().get(
				"request");
		System.out.println(employee.getName());
		if(employee.getName()==null||employee.getName()==""){
			this.setMessage("登入失败，请检查用户名或密码");
			return SUCCESS;
		}
		if(employee.getPassword()==null||employee.getPassword()==""){
			this.setMessage("登入失败，请检查用户名或密码");
			return SUCCESS;
		}
		if(employee==null){
			this.setMessage("登入失败，请检查用户名或密码");
			return SUCCESS;
		}else{
			request.put("employee", employee1);
			return SUCCESS;
		}
		
		
	}
	
	

}
