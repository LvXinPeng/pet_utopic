package com.pet_utopic.dao;

import java.util.List;

import com.pet_utopic.model.Goods;

public interface GoodsMapper {

	public List<Goods> getAllGoods() ;

	public List<Goods> getGoodsByType(int type) ;
	public void buyGoods(Goods goods);

}
