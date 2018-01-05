package com.pet_utopic.model;


public class PetForKeep {

	

	private int petId;
	private int onwerId;
	private String petName;
	private String variety;
	private String startDate;
	private String endDate;
	private double price;
	private String petPhoto;
	private String petInfo;
	
	public PetForKeep(){
		
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPetPhoto() {
		return petPhoto;
	}
	public void setPetPhoto(String petPhoto) {
		this.petPhoto = petPhoto;
	}
	public String getPetInfo() {
		return petInfo;
	}
	public void setPetInfo(String petInfo) {
		this.petInfo = petInfo;
	}

	public int getOnwerId() {
		return onwerId;
	}

	public void setOnwerId(int onwerId) {
		this.onwerId = onwerId;
	}

	@Override
	public String toString() {
		return "PetForKeep [petId=" + petId + ", onwerId=" + onwerId
				+ ", petName=" + petName + ", variety=" + variety
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", price=" + price + ", petPhoto=" + petPhoto + ", petInfo="
				+ petInfo + "]";
	}
	
	
	
}
