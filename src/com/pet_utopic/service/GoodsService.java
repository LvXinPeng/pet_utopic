package com.pet_utopic.service;

import java.util.List;

import com.pet_utopic.model.Goods;

public interface GoodsService {
	public List<Goods> getAllGoods() ;

	public List<Goods> getGoodsByType(int type) ;
	public void buyGoods(Goods goods);
}
