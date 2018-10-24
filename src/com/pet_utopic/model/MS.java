package com.pet_utopic.model;
/**
 * 
* <p>Title: MS</p>  
* <p>Description: 意见反馈</p>   
* @author 李仲浩  
* @date 2018年1月1日
 */
public class MS {
	private int messageboard_id;//意见反馈ID
	private String message;//意见信息
	private int user_id;//提供反馈的用户ID
	public int getMessageboard_id() {
		return messageboard_id;
	}
	public void setMessageboard_id(int messageboard_id) {
		this.messageboard_id = messageboard_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
