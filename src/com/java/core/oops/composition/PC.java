package com.java.core.oops.composition;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	public void powerup() {
		theCase.pressPowerButton();
		drawlogo();
		
		
	}
	public void drawlogo() {
		monitor.DrawPixel(2140, 5020, "Yellow");
	}
	



	
	
	

}
