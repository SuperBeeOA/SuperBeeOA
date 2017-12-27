package cn.bdqn.j25.action;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.Performances;
import cn.bdqn.j25.pojo.Wages;
import cn.bdqn.j25.service.EmployeeService;
import cn.bdqn.j25.service.PerformancesService;
import cn.bdqn.j25.service.WagesService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class WageAction extends ActionSupport {
	
	private EmployeeService employeeService;
	private PerformancesService performancesService;
	private JSONObject result;
	private Map<String, Object> session = ActionContext.getContext().getSession();
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public PerformancesService getPerformancesService() {
		return performancesService;
	}
	public void setPerformancesService(PerformancesService performancesService) {
		this.performancesService = performancesService;
	}
	public JSONObject getResult() {
		return result;
	}
	public void setResult(JSONObject result) {
		this.result = result;
	}
	public String balance(){
		Employee employee = (Employee) session.get("employee");
		Map<String,Object> list = new HashMap<String,Object>();
		list.put("employeeid", employee.getEmployeeid());
		list.put("name",employee.getName());
		list.put("money",employee.getMoney());
		result = JSONObject.fromObject(list);
//		List<Performances> performancesList = performancesService.findByEmployee(employee);
//		System.out.println(performancesList.get(0).getTime());
		return SUCCESS;
	}
}
