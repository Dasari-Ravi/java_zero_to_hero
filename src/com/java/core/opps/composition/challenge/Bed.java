package com.java.core.opps.composition.challenge;

public class Bed {
	private String Style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;
	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		
		this.Style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	
	public void make() {
		System.out.println("bed ->making");
	}

	public String getStyle() {
		return Style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeight() {
		return height;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilt() {
		return quilt;
	}
	
	
	
	
	

}
