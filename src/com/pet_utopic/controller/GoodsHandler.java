package com.pet_utopic.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pet_utopic.dao.GoodsMapper;
import com.pet_utopic.model.Goods;
import com.pet_utopic.service.GoodsService;
import com.pet_utopic.service.impl.GoodsServiceImpl;

@Controller
public class GoodsHandler {
	
	private GoodsService goodsService;
	public GoodsService getGoodsService() {
		return goodsService;
	}
	
	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	/**
	 * 
	* @Title: getAllGoods   
	* @Description: 得到所有的商品
	* @param @param map
	* @param @return     
	* @return String      
	* @throws
	 */
	@RequestMapping("getallgoods")
	public String getAllGoods(Map<String, Object> map){
		List<Goods> goods = goodsService.getAllGoods();
		map.put("goods", goods);
		return "allgoods";
		
	}
	/**
	 * 
	* @Title: getGoodsByType   
	* @Description: 对商品进行分类
	* @param @param map
	* @param @param type
	* @param @return 
	* @return String      
	* @throws
	 */
	@RequestMapping("getgoodsbytype")
	public String getGoodsByType(Map<String, Object> map,@RequestParam(value = "goods_type") int type){
		List<Goods> goods = goodsService.getGoodsByType(type);
		map.put("goods", goods);
		return "allgoods";
	}
	/**
	 * 
	* @Title: getGoodsByType   
	* @Description: 购买商品
	* @param @param map
	* @param @param goods
	* @param @return 
	* @return String      
	* @throws
	 */
	@RequestMapping("buygoods")
	public String getGoodsByType(Map<String, Object> map,Goods goods){
		goodsService.buyGoods(goods);;
		return "";
	}
}
