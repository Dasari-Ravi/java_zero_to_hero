package com.java.hackthon.sumofdigits;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("sum of digts of "+sumofdigit(125));
		
	}
   public static int sumofdigit(int number) {
	  // int sum;
    	if(number<10) {
    		return -1;
    		//int sum=0;
    	}
    	int sum=0;
    	
    	while(number>0) {
    		int digit=number%10;
    		//to extract the least number
    		//125%10=5;
    		sum+=digit;
    		//number=12/10=
    		number/=10;
    		
    	}
    	return sum;
    }
	
	
    
}
