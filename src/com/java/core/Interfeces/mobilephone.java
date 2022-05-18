package com.java.core.Interfeces;

public class mobilephone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	private boolean Ison=false;
	
	
	
	
	
	
	
	

	public mobilephone(int myNumber) {
		this.myNumber = myNumber;
	}
	
	public void powerOn() {
		Ison=true;
		
		System.out.println("MobilePhone just poweredUp");
		
		
	}
	
	public void dial(int phoneNumber) {
		if(Ison) {
			System.out.println("Now ringing "+phoneNumber+" on mobilePhone");
			
		}else {
			System.out.println("Phone is switched Off");
		}
		
		
		
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println(" Answering the column");
			isRinging=false;
			
		}
		
		
	}
	
	public boolean CallPhone(int phoneNumber) {
		if(phoneNumber==myNumber&&Ison) {
			isRinging=true;
			System.out.println(" Melody Ring ");
			
		}else {
			isRinging=false;
			System.out.println("mobile phone not on ");
		}
		
		return isRinging;
	}
	
	public boolean isRinging() {
		
		return isRinging;
	}
	
	
	

}
