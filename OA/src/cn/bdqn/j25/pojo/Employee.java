package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private BigDecimal employeeid;
	private Team team;
	private Department department;
	private Workshop workshop;
	private String workid;
	private String name;
	private String sex;
	private String nation;
	private Timestamp birthday;
	private Timestamp entrytime;
	private String post;
	private String education;
	private String phone;
	private String address;
	private BigDecimal money;
	private String password;
	private BigDecimal resttime;
	private Set outs = new HashSet(0);
	private Set wageses = new HashSet(0);
	private Set accountses = new HashSet(0);
	private Set checkses = new HashSet(0);
	private Set contactsForSender = new HashSet(0);
	private Set attendances = new HashSet(0);
	private Set ordersesForOriginator = new HashSet(0);
	private Set contactsForRecipient = new HashSet(0);
	private Set enters = new HashSet(0);
	private Set ordersesForOperator = new HashSet(0);
	private Set monitoringsForProorderpeople = new HashSet(0);
	private Set proorders = new HashSet(0);
	private Set procurementsForOperator = new HashSet(0);
	private Set procurementsForOriginator = new HashSet(0);
	private Set monitoringsForProducter = new HashSet(0);
	private Set announcements = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(Team team, Department department, Workshop workshop,
			String workid, String name, String sex, String nation,
			Timestamp birthday, Timestamp entrytime, String post,
			String education, String phone, String address, BigDecimal money,
			String password, BigDecimal resttime, Set outs, Set wageses,
			Set accountses, Set checkses, Set contactsForSender,
			Set attendances, Set ordersesForOriginator,
			Set contactsForRecipient, Set enters, Set ordersesForOperator,
			Set monitoringsForProorderpeople, Set proorders,
			Set procurementsForOperator, Set procurementsForOriginator,
			Set monitoringsForProducter, Set announcements) {
		this.team = team;
		this.department = department;
		this.workshop = workshop;
		this.workid = workid;
		this.name = name;
		this.sex = sex;
		this.nation = nation;
		this.birthday = birthday;
		this.entrytime = entrytime;
		this.post = post;
		this.education = education;
		this.phone = phone;
		this.address = address;
		this.money = money;
		this.password = password;
		this.resttime = resttime;
		this.outs = outs;
		this.wageses = wageses;
		this.accountses = accountses;
		this.checkses = checkses;
		this.contactsForSender = contactsForSender;
		this.attendances = attendances;
		this.ordersesForOriginator = ordersesForOriginator;
		this.contactsForRecipient = contactsForRecipient;
		this.enters = enters;
		this.ordersesForOperator = ordersesForOperator;
		this.monitoringsForProorderpeople = monitoringsForProorderpeople;
		this.proorders = proorders;
		this.procurementsForOperator = procurementsForOperator;
		this.procurementsForOriginator = procurementsForOriginator;
		this.monitoringsForProducter = monitoringsForProducter;
		this.announcements = announcements;
	}

	// Property accessors

	public BigDecimal getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(BigDecimal employeeid) {
		this.employeeid = employeeid;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Workshop getWorkshop() {
		return this.workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public String getWorkid() {
		return this.workid;
	}

	public void setWorkid(String workid) {
		this.workid = workid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public Timestamp getEntrytime() {
		return this.entrytime;
	}

	public void setEntrytime(Timestamp entrytime) {
		this.entrytime = entrytime;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getResttime() {
		return this.resttime;
	}

	public void setResttime(BigDecimal resttime) {
		this.resttime = resttime;
	}

	public Set getOuts() {
		return this.outs;
	}

	public void setOuts(Set outs) {
		this.outs = outs;
	}

	public Set getWageses() {
		return this.wageses;
	}

	public void setWageses(Set wageses) {
		this.wageses = wageses;
	}

	public Set getAccountses() {
		return this.accountses;
	}

	public void setAccountses(Set accountses) {
		this.accountses = accountses;
	}

	public Set getCheckses() {
		return this.checkses;
	}

	public void setCheckses(Set checkses) {
		this.checkses = checkses;
	}

	public Set getContactsForSender() {
		return this.contactsForSender;
	}

	public void setContactsForSender(Set contactsForSender) {
		this.contactsForSender = contactsForSender;
	}

	public Set getAttendances() {
		return this.attendances;
	}

	public void setAttendances(Set attendances) {
		this.attendances = attendances;
	}

	public Set getOrdersesForOriginator() {
		return this.ordersesForOriginator;
	}

	public void setOrdersesForOriginator(Set ordersesForOriginator) {
		this.ordersesForOriginator = ordersesForOriginator;
	}

	public Set getContactsForRecipient() {
		return this.contactsForRecipient;
	}

	public void setContactsForRecipient(Set contactsForRecipient) {
		this.contactsForRecipient = contactsForRecipient;
	}

	public Set getEnters() {
		return this.enters;
	}

	public void setEnters(Set enters) {
		this.enters = enters;
	}

	public Set getOrdersesForOperator() {
		return this.ordersesForOperator;
	}

	public void setOrdersesForOperator(Set ordersesForOperator) {
		this.ordersesForOperator = ordersesForOperator;
	}

	public Set getMonitoringsForProorderpeople() {
		return this.monitoringsForProorderpeople;
	}

	public void setMonitoringsForProorderpeople(Set monitoringsForProorderpeople) {
		this.monitoringsForProorderpeople = monitoringsForProorderpeople;
	}

	public Set getProorders() {
		return this.proorders;
	}

	public void setProorders(Set proorders) {
		this.proorders = proorders;
	}

	public Set getProcurementsForOperator() {
		return this.procurementsForOperator;
	}

	public void setProcurementsForOperator(Set procurementsForOperator) {
		this.procurementsForOperator = procurementsForOperator;
	}

	public Set getProcurementsForOriginator() {
		return this.procurementsForOriginator;
	}

	public void setProcurementsForOriginator(Set procurementsForOriginator) {
		this.procurementsForOriginator = procurementsForOriginator;
	}

	public Set getMonitoringsForProducter() {
		return this.monitoringsForProducter;
	}

	public void setMonitoringsForProducter(Set monitoringsForProducter) {
		this.monitoringsForProducter = monitoringsForProducter;
	}

	public Set getAnnouncements() {
		return this.announcements;
	}

	public void setAnnouncements(Set announcements) {
		this.announcements = announcements;
	}

}