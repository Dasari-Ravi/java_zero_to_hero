package com.java.core.oops.overloading;

public class OverloadingTheme {
	public static void main(String[] args) {
		int newscore=calculatescore("Ravi",1200);
		System.out.println("newscore score "+ newscore);
		calculatescore(74);
		calculatescore();		
		
	}
	public static int calculatescore(String playername,int score) {
		System.out.println("player "+playername+" scored "+score+" points ");
		return score*10;
	}
	public static int calculatescore(int score) {
		System.out.println("unname player scored " + score+" points ");
		return score*10;
	}
	public static int calculatescore() {
		System.out.println("no name of the player no scored ");
		return 0;
	}
}

