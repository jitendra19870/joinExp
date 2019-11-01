package com.nit.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cust_tab")
public class Customer {
	@Id
	@Column(name="cid")
	private int customerId;
	@Column(name="cname")
	private String customerName;
	@Column(name="ccity")
	private String customerCity;
	@OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
	@JoinColumn(name="cidFk")
	private Set<Item> itemObj=new HashSet<Item>() ;
	public Customer() {
		super();
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public Set<Item> getItemObj() {
		return itemObj;
	}
	public void setItemObj(Set<Item> itemObj) {
		this.itemObj = itemObj;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", itemObj=" + itemObj + "]";
	}
	

}
