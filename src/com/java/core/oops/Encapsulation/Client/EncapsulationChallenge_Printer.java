package com.java.core.oops.Encapsulation.Client;

public class EncapsulationChallenge_Printer {

	private int tonerLevel;
	private int pagesPrinter;
	private boolean duplex;

	public EncapsulationChallenge_Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel >= -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}

		this.duplex = duplex;
		this.pagesPrinter = 0;
	}

	public int addToner(int tonerAmount) {
		if (tonerAmount >= 0 && tonerAmount <= 100) {
			if (tonerLevel + tonerAmount >= 100) {
				return -1;

			}
			this.tonerLevel+=tonerAmount;
			return this.tonerLevel;

		} else {
			return -1;
		}

	}
	public int printPages(int pages) {
		int pagesToprint=pages;
		if(this.duplex) {
			pagesToprint/=2;
			System.out.println("printing in duplex mode"+pages);
		}
		this.pagesPrinter+=pagesToprint;
		return pagesToprint;
	}

	public int getPagesPrinter() {
		return pagesPrinter;
	}

	


	
	

}
