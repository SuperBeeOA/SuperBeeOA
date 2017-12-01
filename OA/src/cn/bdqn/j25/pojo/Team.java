package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Team entity. @author MyEclipse Persistence Tools
 */

public class Team implements java.io.Serializable {

	// Fields

	private BigDecimal teamid;
	private String teamname;
	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Team() {
	}

	/** full constructor */
	public Team(String teamname, Set employees) {
		this.teamname = teamname;
		this.employees = employees;
	}

	// Property accessors

	public BigDecimal getTeamid() {
		return this.teamid;
	}

	public void setTeamid(BigDecimal teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return this.teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}