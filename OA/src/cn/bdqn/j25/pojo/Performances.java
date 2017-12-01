package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Performances entity. @author MyEclipse Persistence Tools
 */

public class Performances implements java.io.Serializable {

	// Fields

	private BigDecimal performanceid;
	private String name;
	private BigDecimal performancebonus;
	private Timestamp time;
	private String levels;

	// Constructors

	/** default constructor */
	public Performances() {
	}

	/** full constructor */
	public Performances(String name, BigDecimal performancebonus,
			Timestamp time, String levels) {
		this.name = name;
		this.performancebonus = performancebonus;
		this.time = time;
		this.levels = levels;
	}

	// Property accessors

	public BigDecimal getPerformanceid() {
		return this.performanceid;
	}

	public void setPerformanceid(BigDecimal performanceid) {
		this.performanceid = performanceid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPerformancebonus() {
		return this.performancebonus;
	}

	public void setPerformancebonus(BigDecimal performancebonus) {
		this.performancebonus = performancebonus;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

}