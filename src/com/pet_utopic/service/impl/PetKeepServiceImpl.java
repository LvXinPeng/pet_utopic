package com.pet_utopic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet_utopic.dao.PetKeepMapper;
import com.pet_utopic.model.PetForKeep;
import com.pet_utopic.service.PetKeepService;

@Service("petKeepService")
public class PetKeepServiceImpl implements PetKeepService {

	@Autowired
	private PetKeepMapper petKeepMapper;

	public PetKeepMapper getPetKeepMapper() {
		return petKeepMapper;
	}

	public void setPetKeepMapper(PetKeepMapper petKeepMapper) {
		this.petKeepMapper = petKeepMapper;
	}
	
	@Override
	public int createPetForKeep(PetForKeep petForKeep){
		int row = petKeepMapper.createPetForKeep(petForKeep);
		return row;
	}
	@Override
	public int updatePetForKeep(PetForKeep petForKeep){
		int row = petKeepMapper.updatePetForKeep(petForKeep);
		return row;
	}
	@Override
	public void deletePetForKeep(int pid){
		petKeepMapper.deletePetForKeep(pid);
	}

	@Override
	public List<PetForKeep> getAllProducts() {
		List<PetForKeep> petForKeeps = petKeepMapper.getAllPetForKeep();
		return petForKeeps;
	}

	
}
