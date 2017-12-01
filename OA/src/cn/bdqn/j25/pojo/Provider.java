package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Provider entity. @author MyEclipse Persistence Tools
 */

public class Provider implements java.io.Serializable {

	// Fields

	private BigDecimal providerid;
	private Types types;
	private String providername;
	private String address;
	private String phone;
	private String contacts;
	private String remarks;
	private String comments;
	private Set equipments = new HashSet(0);
	private Set materials = new HashSet(0);

	// Constructors

	/** default constructor */
	public Provider() {
	}

	/** full constructor */
	public Provider(Types types, String providername, String address,
			String phone, String contacts, String remarks, String comments,
			Set equipments, Set materials) {
		this.types = types;
		this.providername = providername;
		this.address = address;
		this.phone = phone;
		this.contacts = contacts;
		this.remarks = remarks;
		this.comments = comments;
		this.equipments = equipments;
		this.materials = materials;
	}

	// Property accessors

	public BigDecimal getProviderid() {
		return this.providerid;
	}

	public void setProviderid(BigDecimal providerid) {
		this.providerid = providerid;
	}

	public Types getTypes() {
		return this.types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public String getProvidername() {
		return this.providername;
	}

	public void setProvidername(String providername) {
		this.providername = providername;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Set getEquipments() {
		return this.equipments;
	}

	public void setEquipments(Set equipments) {
		this.equipments = equipments;
	}

	public Set getMaterials() {
		return this.materials;
	}

	public void setMaterials(Set materials) {
		this.materials = materials;
	}

}