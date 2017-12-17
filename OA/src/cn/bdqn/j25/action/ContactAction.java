package cn.bdqn.j25.action;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.List;
import java.util.Map;
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
		
		
		
		return SUCCESS;

	}
	
	


	public String addContact() {
//		System.out.println("....aaaaa...................");
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//    	String date = df.format(new Date());
//    	Timestamp ts = new Timestamp(System.currentTimeMillis());  
//    	 ts = Timestamp.valueOf(date); 
//    	 contact.setTime(ts);
//    	Employee employeeBySender=(Employee) ActionContext.getContext().getSession().get("employee");
//    	 employeeBySender=employeeService.findByid(employeeBySender.getEmployeeid());
//    	 contact.setEmployeeBySender(employeeBySender);
//		System.out.println(contact.getEmployeeBySender().getName());
//		System.out.println(contact.getContent());
//		employeeByRecipient=employeeService.findByName(contact.getEmployeeByRecipient().getName()).get(0);
//		contact.setEmployeeByRecipient(employeeByRecipient);
//		contactService.addContact(contact);
		
		Employee employeeByRecipient=(Employee) ActionContext.getContext().getSession().get("employee");
		String empName=employeeByRecipient.getName();
		System.out.println(empName);
		List<Contact> conByRec = contactService.finaCantecByRecipient(empName);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+conByRec.size());
		
		System.out.println("...............................");
		return SUCCESS;
	} 
	/*public String getContactList() {
		Employee employeeByRecipient=(Employee) ActionContext.getContext().getSession().get("employee");
		String empName=employeeByRecipient.getName();
		List<Contact> conByRec= contactService.finaCantecByRecipient(empName);
		System.out.println(conByRec.size());
		
		return SUCCESS;
	}*/
}
