package com.java.hackthon.oddnumber;

public class OddNumberTest {
	public static void main(String[] args) {
     int Count = 0;
	int sum=0;
	for(int i=1;i<=1000;i++) {
		if((i%3==0)&&(i%5==0)) {
		 Count++;
		  sum+=i;
		  System.out.println("foundnumber= "+ i);
		  System.out.println("sum "+sum);
		
	}
	if (Count==5) {
		break;
		
	}
	}
	System.out.println("sum "+sum);
	}
}
	
