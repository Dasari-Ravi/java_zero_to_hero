package com.java.core.opps.composition.challenge;

public class Bedroom {
	private String name;
	private int wall1;
	private int wall2;
    private int wall3;
    private int wall4;
    private Celling celling;
    private Bed bed;
    private Lamp lamp;
    
    
	public Bedroom(String name, wall wall1, Wall wall2, Wall wall3, Wall wall4, Celling celling, Bed bed, Lamp lamp) {
		
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.celling = celling;
		this.bed = bed;
		this.lamp = lamp;
	}
    
	public Lamp getLamp() {
    	return this.lamp;
    }
    
    public void makeBed() {
    	System.out.println("Bedroom->making bed");
    	bed.make();
    }
    
}
