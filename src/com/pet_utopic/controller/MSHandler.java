package com.pet_utopic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pet_utopic.model.MS;
import com.pet_utopic.service.MSService;
import com.pet_utopic.service.impl.MSServiceImpl;

@Controller
public class MSHandler {
	private MSService msService;
	
	public MSService getMsService() {
		return msService;
	}
	
	public void setMsService(MSService msService) {
		this.msService = msService;
	}

	@RequestMapping(value="addmessage",method=RequestMethod.GET)
	public String addMessage(MS ms){
		MS ms1 = new MS();
		ms1.setMessage("1234");
		ms.setUser_id(1);
		msService.addMessage(ms1);
		return "main";
		
	}
}
