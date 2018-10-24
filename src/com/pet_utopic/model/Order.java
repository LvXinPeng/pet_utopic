package com.pet_utopic.model;
/**
 * 
* <p>Title: Order</p>  
* <p>Description: 订单</p>   
* @author 李仲浩  
* @date 2018年1月1日
 */
public class Order {
	private int order_id;//订单ID
	private int user_id;//用户ID
	private int goods_id;//商品ID
	private int buy_num;//购买数量
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getBuy_num() {
		return buy_num;
	}
	public void setBuy_num(int buy_num) {
		this.buy_num = buy_num;
	}
	
}
