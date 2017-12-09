package cn.bdqn.j25.pojo;

import java.math.BigDecimal;

import org.apache.struts2.json.annotations.JSON;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer productid;
	private Types types;
	private String productname;
	private String productno;
	private BigDecimal productprice;
	private String component;
	private Integer shelflife;
	private String productmodel;
	private BigDecimal productioncost;
	private BigDecimal truckage;
	private String productremarks;
	private String unit;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(String productname) {
		this.productname = productname;
	}
	
	

	public Product(Integer productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
		
	}

	/** full constructor */
	
	// Property accessors

	public Integer getProductid() {
		return this.productid;
	}

	public Product(Types types, String productname,
			String productno, BigDecimal productprice, String component,
			Integer shelflife, String productmodel, BigDecimal productioncost,
			BigDecimal truckage, String productremarks, String unit) {
		super();
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
		this.unit = unit;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	
//	@JSON (serialize=false)
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

	public Integer getShelflife() {
		return this.shelflife;
	}

	public void setShelflife(Integer shelflife) {
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

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}