package com.pet_utopic.model;
/**
 * 
* <p>Title: Goods</p>  
* <p>Description: 商品</p>   
* @author 李仲浩  
* @date 2018年1月1日
 */
public class Goods {
	private int goods_id;//商品ID
	private String goods_name;//商品名
	private float price;//商品单价
	private int num;//商品数量
	private String photo;//商品图片
	private int type;//商品种类：1.食品2.日用品
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
