package com.pet_utopic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pet_utopic.dao.GoodsMapper;
import com.pet_utopic.model.Goods;
import com.pet_utopic.service.GoodsService;

public class GoodsServiceImpl implements GoodsService{
	private GoodsMapper goodsMapper;
	
	public GoodsMapper getGoodsMapper() {
		return goodsMapper;
	}
	@Autowired
	public void setGoodsMapper(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	@Override
	public List<Goods> getAllGoods() {
		List<Goods> goods = goodsMapper.getAllGoods();
		return goods;
	}

	@Override
	public List<Goods> getGoodsByType(int type) {
		List<Goods> goods = goodsMapper.getGoodsByType(type);
		return goods;
	}

	@Override
	public void buyGoods(Goods goods) {
		goodsMapper.buyGoods(goods);
		
	}
	
}
