package com.pet_utopic.model;
/**
 * 
* <p>Title: User</p>  
* <p>Description: 用户</p>   
* @author 李仲浩  
* @date 2018年1月1日
 */
public class User {
	private int user_id;//用户ID
	private String username;//用户名
	private String password;//密码
	private String real_name;//真实姓名
	private String email;//邮箱
	private String address;//地址
	private String phone;//手机
	private String gender;//性别
	private String head_shot;
	private String info;//简介
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username
				+ ", password=" + password + ", real_name=" + real_name
				+ ", email=" + email + ", address=" + address + ", phone="
				+ phone + ", gender=" + gender + ", head_shot=" + head_shot
				+ ", info=" + info + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHead_shot() {
		return head_shot;
	}
	public void setHead_shot(String head_shot) {
		this.head_shot = head_shot;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
