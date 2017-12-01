package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Contact entity. @author MyEclipse Persistence Tools
 */

public class Contact implements java.io.Serializable {

	// Fields

	private BigDecimal contactid;
	private Employee employeeByRecipient;
	private State state;
	private Employee employeeBySender;
	private String content;
	private Timestamp time;
	private BigDecimal permissions;

	// Constructors

	/** default constructor */
	public Contact() {
	}

	/** full constructor */
	public Contact(Employee employeeByRecipient, State state,
			Employee employeeBySender, String content, Timestamp time,
			BigDecimal permissions) {
		this.employeeByRecipient = employeeByRecipient;
		this.state = state;
		this.employeeBySender = employeeBySender;
		this.content = content;
		this.time = time;
		this.permissions = permissions;
	}

	// Property accessors

	public BigDecimal getContactid() {
		return this.contactid;
	}

	public void setContactid(BigDecimal contactid) {
		this.contactid = contactid;
	}

	public Employee getEmployeeByRecipient() {
		return this.employeeByRecipient;
	}

	public void setEmployeeByRecipient(Employee employeeByRecipient) {
		this.employeeByRecipient = employeeByRecipient;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Employee getEmployeeBySender() {
		return this.employeeBySender;
	}

	public void setEmployeeBySender(Employee employeeBySender) {
		this.employeeBySender = employeeBySender;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public BigDecimal getPermissions() {
		return this.permissions;
	}

	public void setPermissions(BigDecimal permissions) {
		this.permissions = permissions;
	}

}