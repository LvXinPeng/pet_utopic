package com.pet_utopic.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.pet_utopic.model.PetForKeep;
import com.pet_utopic.service.PetKeepService;

@Controller
public class PetKeepHandler {
	
	@Autowired
	private PetKeepService petKeepService;

	public PetKeepService getPetKeepService() {
		return petKeepService;
	}

	public void setPetKeepService(PetKeepService petKeepService) {
		this.petKeepService = petKeepService;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)  
    public String upload(@RequestParam(value = "photo", required = false) MultipartFile file,  
            @RequestParam(value = "petName", required = false)String petName,  
            @RequestParam(value = "variety", required = false)String variety,  
            @RequestParam(value = "price", required = false)Double price,  
            @RequestParam(value = "startDate", required = false)String startDate,  
            @RequestParam(value = "endDate", required = false)String endDate,  
            @RequestParam(value = "petInfo", required = false)String petInfo,  
            MultipartHttpServletRequest request, ModelMap model) {  
  
        String path = request.getSession().getServletContext().getRealPath("");  
        String fileName = file.getOriginalFilename();  
        System.out.println("==>filename:      "+fileName);
        // String fileName = new Date().getTime()+".jpg";         
        File targetFile = new File(path, fileName);  
        if (!targetFile.exists()) {  
            targetFile.mkdirs();  
        }  
  
        // 保存  
        try {  
            file.transferTo(targetFile);  
        }  
        catch (Exception e) {  
            e.printStackTrace();  
        }  
        //model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);  
          
        //储存宠物信息  
        PetForKeep petForKeep = new PetForKeep();  
        petForKeep.setPetName(petName); 
        petForKeep.setVariety(variety);  
        petForKeep.setPrice(price);  
        petForKeep.setStartDate(startDate);
        petForKeep.setEndDate(endDate);
       String imgpath=(path+fileName);  
       System.out.println("==>imgpath:     "+imgpath);
        petForKeep.setPetPhoto(fileName);  
        petForKeep.setPetInfo(petInfo);
        
        int affected_row = petKeepService.createPetForKeep(petForKeep);
		if (affected_row == 1) {
			return "pet/success";
		}
		else {
			
			return "pet/product";
		}
          
     
    }
	
	@RequestMapping("pet/getallproducts")
	public String allProducts(Map<String, Object> map) {
		List<PetForKeep> petForKeeps = petKeepService.getAllProducts();
		for (PetForKeep petForKeep : petForKeeps) {
			System.out.println(petForKeep.toString());
		}
		map.put("petforkeeps", petForKeeps);
		return "pet/product";
		
	}
	
	/*@RequestMapping("pet/concretePetInfo")
	public String concretePetInfo(Model model) {
		List<PetForKeep> petForKeeps = petKeepService.getAllProducts();
		for (PetForKeep petForKeep : petForKeeps) {
			System.out.println(petForKeep.toString());
		}
		//model.addAttribute("petName",petName);
		return "pet/single";
		
	}*/
	
	
	@RequestMapping("updatepetforkeep")
	public String updatePetForKeep(PetForKeep petForKeep){
		System.out.println(petForKeep.toString());
		int affected_row = petKeepService.updatePetForKeep(petForKeep);
		if(affected_row == 1){
			//成功返回页面
			return "pet/buypet";
		}else {
			//返回404
			return "pet/buypet";
		}
		
	
	}

}