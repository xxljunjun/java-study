package com.xxl.service;

import com.xxl.bean.Customer;

public class CustomerList {
	//属性
	private Customer[] customers;  //用来保存客户对象的数组
	private int total = 0;  //记录已保存客户对象的数量
	//构造器
	public CustomerList(){
		
	}
	/**
	 * 用来初始化customer数组的构造器
	 * @param totalCustomer：指定数组长度
	 * */
	public CustomerList(int totalCustomer){
		
	}
	/**
	 * 
	* @Description 添加一个客户
	* @author shkstart
	* @date 2022年5月24日下午8:54:00
	* @param customer
	* @return
	 */
	public boolean addCustomer(Customer customer){
		if(total>=customers.length){
			return false;
		}
		customers[total] = customer;
		total++;
		return true;
	}
	/**
	 * 
	* @Description 修改指定索引位置的信息
	* @author shkstart
	* @date 2022年5月24日下午8:53:43
	* @param index
	* @param cust
	* @return
	 */
	public boolean replaceCustomer(int index, Customer cust){
		if(index<0 || index>=total){
			return false;
		}
		customers[index] = cust;
		return true;
	}
	/**
	 * 
	* @Description 删除某个客户
	* @author shkstart
	* @date 2022年5月24日下午8:53:22
	* @param index
	* @return
	 */
	public boolean deleteCustomer(int index){
		if(index<0 || index>=total){
			return false;
		}
		//数组是有序的
		for(int i = index;i<total-1;i++){
			customers[i] = customers[i+1];
		}
		//最后有数据的元素设置为null
		customers[total-1] = null;
		return true;
	}
	/**
	 * 
	* @Description 获取所有的客户
	* @author shkstart
	* @date 2022年5月24日下午8:53:10
	* @return
	 */
	public Customer[] getAllCustomers(){
		//最长的数组
		Customer[] custs = new Customer[total];
		for(int i = 0;i<total;i++){
			custs[i] = customers[i];
		}	
		return custs;
	}
	/**
	 * 
	* @Description 获取某个客户
	* @author shkstart
	* @date 2022年5月24日下午8:52:48
	* @param index
	* @return
	 */
	public Customer getCustomer(int index){
		if(index<0 || index>=total){
			return null;
		}
		return customers[index];
	}
	/**
	 * 
	* @Description 获取客户对象数量
	* @author shkstart
	* @date 2022年5月24日下午8:52:31
	* @return
	 */
	public int getTotal(){
		return total;
	}
}
