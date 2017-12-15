package cn.bdqn.j25.action;

<<<<<<< HEAD
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
=======
import java.util.List;
import java.util.Map;

>>>>>>> 6b96a9e68ae9478909f16c5cd8697c7ff8310b07
import cn.bdqn.j25.pojo.Contact;
import cn.bdqn.j25.pojo.Department;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.service.ContactService;
import cn.bdqn.j25.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ContactAction extends ActionSupport {
	private EmployeeService employeeService;
	private Employee employeeBySender;// 发
	private Employee employeeByRecipient;// 收
	private Contact contact;
	private Department department;
	private ContactService contactService;
	private InputStream inputStream;

	public InputStream getInputStream() {
		return inputStream;
	}
	public ContactService getContactService() {
		return contactService;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}


	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee getEmployeeBySender() {
		return employeeBySender;
	}

	public void setEmployeeBySender(Employee employeeBySender) {
		this.employeeBySender = employeeBySender;
	}

	public Employee getEmployeeByRecipient() {
		return employeeByRecipient;
	}

	public void setEmployeeByRecipient(Employee employeeByRecipient) {
		this.employeeByRecipient = employeeByRecipient;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
<<<<<<< HEAD

	public String getEmps() {
		List<Employee> listemp = employeeService
				.findByDepartmentName(department.getDepartmentname());
		StringBuffer empNameJson = new StringBuffer("[");
		int count = 0;
		for (Employee e : listemp) {
			empNameJson.append("{\"empName\":\"" + e.getName() + "\"}");
			if (count < listemp.size() - 1) {
				empNameJson.append(",");
			}
			count++;
		}
		empNameJson.append("]");
		try {
			inputStream = new ByteArrayInputStream(empNameJson.toString()
					.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
=======
	
	
	
	public String getEmps(){
		List<Employee> listemp=employeeService.findByDepartmentName(department.getDepartmentname());
		employeeBySender=(Employee) ActionContext.getContext().getSession().get("employee");
		Map<String, Object> request = (Map) ActionContext.getContext().get("request");
		request.put("listemps",listemp);
>>>>>>> 6b96a9e68ae9478909f16c5cd8697c7ff8310b07
		return SUCCESS;
	}

	public String addContact() {
		System.out.println("....aaaaa...................");

		System.out.println(contact.getEmployeeBySender().getName());
		System.out.println(contact.getContent());
	
		contactService.addContact(contact);
		System.out.println("...............................");
		return SUCCESS;
	}

}
