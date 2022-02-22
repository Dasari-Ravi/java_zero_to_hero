package com.java.core.oops.composition;

public class Motherboard {
	private String model;
	private String manufacture;
	private int ramSlots;
	private int cardslots;
	private String bios;
	
	
	public Motherboard(String model, String manufacture, int ramSlots, int cardslots, String bios) {
	
		this.model = model;
		this.manufacture = manufacture;
		this.ramSlots = ramSlots;
		this.cardslots = cardslots;
		this.bios = bios;
	}
	public void Programload(String programName) {
		System.out.println("program "+programName+" is now loading.....");
	}


	public String getModel() {
		return model;
	}
	


	//public void setModel(String model) {
		//this.model = model;
	//}
	public String getManufacture() {
		return manufacture;
	}


	public int getRamSlots() {
		return ramSlots;
	}


	public int getCardslots() {
		return cardslots;
	}


	public String getBios() {
		return bios;
	}
	

}
