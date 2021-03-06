package model_beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderID;
	private String name;
	private String address;
	private String phoneNumber;
	private int totalMoney;
	private String timeCreate;
	private String paymentMethods;
	private String status;
	private String customerID;
	private ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>();
	private ArrayList<Product_form> listProduct = new ArrayList<Product_form>();

	public void Order() {

	}

	public Order(String orderID, String name, String address, String phoneNumber, int totalMoney, String timeCreate,
			String paymentMethods, String status, String customerID) {
		this.orderID = orderID;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.totalMoney = totalMoney;
		this.timeCreate = timeCreate;
		this.paymentMethods = paymentMethods;
		this.status = status;
		this.customerID = customerID;
	}

	public ArrayList<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(ArrayList<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public ArrayList<Product_form> getListProduct() {
		return listProduct;
	}

	public void setListProduct(ArrayList<Product_form> listProduct) {
		this.listProduct = listProduct;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(String timeCreate) {
		this.timeCreate = timeCreate;
	}

	public String getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(String paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", totalMoney=" + totalMoney + ", timeCreate=" + timeCreate + ", paymentMethods=" + paymentMethods
				+ ", status=" + status + ", customerID=" + customerID + ", orderDetail=" + orderDetail
				+ ", listProduct=" + listProduct + "]\n";
	}

}
