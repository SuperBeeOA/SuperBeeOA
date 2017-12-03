package cn.bdqn.j25.pojo;

import java.math.BigDecimal;

/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */

public class Attendance implements java.io.Serializable {

	// Fields

	private BigDecimal attendanceid;
	private Employee employee;
	private BigDecimal leave;
	private BigDecimal absenteeism;
	private String remarks;

	// Constructors

	/** default constructor */
	public Attendance() {
	}

	/** full constructor */
	public Attendance(Employee employee, BigDecimal leave,
			BigDecimal absenteeism, String remarks) {
		this.employee = employee;
		this.leave = leave;
		this.absenteeism = absenteeism;
		this.remarks = remarks;
	}

	// Property accessors

	public BigDecimal getAttendanceid() {
		return this.attendanceid;
	}

	public void setAttendanceid(BigDecimal attendanceid) {
		this.attendanceid = attendanceid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BigDecimal getLeave() {
		return this.leave;
	}

	public void setLeave(BigDecimal leave) {
		this.leave = leave;
	}

	public BigDecimal getAbsenteeism() {
		return this.absenteeism;
	}

	public void setAbsenteeism(BigDecimal absenteeism) {
		this.absenteeism = absenteeism;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}