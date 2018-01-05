package com.pet_utopic.dao;

import java.util.List;

import com.pet_utopic.model.PetForKeep;

public interface PetKeepMapper {

	List<PetForKeep> selectPetForKeepsById(int pid);
	int createPetForKeep(PetForKeep petForKeep);
	int updatePetForKeep(PetForKeep petForKeep);
	void deletePetForKeep(int pid);
	List<PetForKeep> getAllPetForKeep();
}
