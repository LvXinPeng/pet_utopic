package com.pet_utopic.service.impl;

import com.pet_utopic.dao.MSMapper;
import com.pet_utopic.model.MS;
import com.pet_utopic.service.MSService;

public class MSServiceImpl implements MSService{
	private MSMapper msMapper;
	
	public MSMapper getMsMapper() {
		return msMapper;
	}

	public void setMsMapper(MSMapper msMapper) {
		this.msMapper = msMapper;
	}

	@Override
	public void addMessage(MS ms) {
		msMapper.addMessage(ms);
		
	}
	
}
