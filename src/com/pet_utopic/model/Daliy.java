package com.pet_utopic.model;
/**
 * 
* <p>Title: Daliy</p>  
* <p>Description: </p>   
* @author 李仲浩  
* @date 2017年12月31日
 */
public class Daliy {
	private int daliy_id;
	private int user_id;
	private String text;
	private String photo;
	public int getDaliy_id() {
		return daliy_id;
	}
	public void setDaliy_id(int daliy_id) {
		this.daliy_id = daliy_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
