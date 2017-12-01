package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private BigDecimal productid;
	private Types types;
	private String productname;
	private String productno;
	private BigDecimal productprice;
	private String component;
	private BigDecimal shelflife;
	private String productmodel;
	private BigDecimal productioncost;
	private BigDecimal truckage;
	private String productremarks;
	private Set orderses = new HashSet(0);
	private Set procurements = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(String productname) {
		this.productname = productname;
	}

	/** full constructor */
	public Product(Types types, String productname, String productno,
			BigDecimal productprice, String component, BigDecimal shelflife,
			String productmodel, BigDecimal productioncost,
			BigDecimal truckage, String productremarks, Set orderses,
			Set procurements) {
		this.types = types;
		this.productname = productname;
		this.productno = productno;
		this.productprice = productprice;
		this.component = component;
		this.shelflife = shelflife;
		this.productmodel = productmodel;
		this.productioncost = productioncost;
		this.truckage = truckage;
		this.productremarks = productremarks;
		this.orderses = orderses;
		this.procurements = procurements;
	}

	// Property accessors

	public BigDecimal getProductid() {
		return this.productid;
	}

	public void setProductid(BigDecimal productid) {
		this.productid = productid;
	}

	public Types getTypes() {
		return this.types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductno() {
		return this.productno;
	}

	public void setProductno(String productno) {
		this.productno = productno;
	}

	public BigDecimal getProductprice() {
		return this.productprice;
	}

	public void setProductprice(BigDecimal productprice) {
		this.productprice = productprice;
	}

	public String getComponent() {
		return this.component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public BigDecimal getShelflife() {
		return this.shelflife;
	}

	public void setShelflife(BigDecimal shelflife) {
		this.shelflife = shelflife;
	}

	public String getProductmodel() {
		return this.productmodel;
	}

	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}

	public BigDecimal getProductioncost() {
		return this.productioncost;
	}

	public void setProductioncost(BigDecimal productioncost) {
		this.productioncost = productioncost;
	}

	public BigDecimal getTruckage() {
		return this.truckage;
	}

	public void setTruckage(BigDecimal truckage) {
		this.truckage = truckage;
	}

	public String getProductremarks() {
		return this.productremarks;
	}

	public void setProductremarks(String productremarks) {
		this.productremarks = productremarks;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getProcurements() {
		return this.procurements;
	}

	public void setProcurements(Set procurements) {
		this.procurements = procurements;
	}

}