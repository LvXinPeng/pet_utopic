package com.pet_utopic.model;
/**
 * 
* <p>Title: Comment</p>  
* <p>Description: 照片评论</p>   
* @author 李仲浩  
* @date 2017年12月31日
 */
public class Comment {
	private int user_id;//用户id
	private String comment;//评论信息
	private int coment_state;//评论状态
	private int pic_id;//图片ID
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getComent_state() {
		return coment_state;
	}
	public void setComent_state(int coment_state) {
		this.coment_state = coment_state;
	}
	public int getPic_id() {
		return pic_id;
	}
	public void setPic_id(int pic_id) {
		this.pic_id = pic_id;
	}
}
