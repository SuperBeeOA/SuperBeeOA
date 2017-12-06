package cn.bdqn.j25.pojo;

import java.math.BigDecimal;

/**
 * Material entity. @author MyEclipse Persistence Tools
 */

public class Material implements java.io.Serializable {

	// Fields

	private Integer materialid;
	private Types types;
	private Provider provider;
	private String materialname;
	private String materialno;
	private BigDecimal materialprice;
	private Integer shelflife;
	private String materialmodel;
	private BigDecimal truckage;
	private String materialremarks;

	// Constructors

	/** default constructor */
	public Material() {
	}

	/** minimal constructor */
	public Material(String materialname) {
		this.materialname = materialname;
	}

	/** full constructor */
	public Material(Types types, Provider provider, String materialname,
			String materialno, BigDecimal materialprice, Integer shelflife,
			String materialmodel, BigDecimal truckage, String materialremarks) {
		this.types = types;
		this.provider = provider;
		this.materialname = materialname;
		this.materialno = materialno;
		this.materialprice = materialprice;
		this.shelflife = shelflife;
		this.materialmodel = materialmodel;
		this.truckage = truckage;
		this.materialremarks = materialremarks;
	}

	// Property accessors

	public Integer getMaterialid() {
		return this.materialid;
	}

	public void setMaterialid(Integer materialid) {
		this.materialid = materialid;
	}

	public Types getTypes() {
		return this.types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getMaterialname() {
		return this.materialname;
	}

	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}

	public String getMaterialno() {
		return this.materialno;
	}

	public void setMaterialno(String materialno) {
		this.materialno = materialno;
	}

	public BigDecimal getMaterialprice() {
		return this.materialprice;
	}

	public void setMaterialprice(BigDecimal materialprice) {
		this.materialprice = materialprice;
	}

	public Integer getShelflife() {
		return this.shelflife;
	}

	public void setShelflife(Integer shelflife) {
		this.shelflife = shelflife;
	}

	public String getMaterialmodel() {
		return this.materialmodel;
	}

	public void setMaterialmodel(String materialmodel) {
		this.materialmodel = materialmodel;
	}

	public BigDecimal getTruckage() {
		return this.truckage;
	}

	public void setTruckage(BigDecimal truckage) {
		this.truckage = truckage;
	}

	public String getMaterialremarks() {
		return this.materialremarks;
	}

	public void setMaterialremarks(String materialremarks) {
		this.materialremarks = materialremarks;
	}

}