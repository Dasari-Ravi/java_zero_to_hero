package com.java.core.oops.composition;

public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resloution nativeResolution;
	        
	public Monitor(String model, String manufacturer, int size, Resloution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	public void DrawPixel(int x,int y,String colour) {
		System.out.println("Drawing pixels at "+x+","+y+" in colour "+colour);
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSize() {
		return size;
	}
	public Resloution getNativeResolution() {
		return nativeResolution;
	}
	
	
	

}
