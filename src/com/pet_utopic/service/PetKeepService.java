package com.pet_utopic.service;

import java.util.List;

import com.pet_utopic.model.PetForKeep;

public interface PetKeepService {

	//List<PetForKeep> selectPetForKeepsById(int pid);
	int createPetForKeep(PetForKeep petForKeep);
	int updatePetForKeep(PetForKeep petForKeep);
	void deletePetForKeep(int pid);
	List<PetForKeep> getAllProducts();
}
