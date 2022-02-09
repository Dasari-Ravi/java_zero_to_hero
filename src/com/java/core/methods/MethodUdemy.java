package com.java.core.methods;

public class MethodUdemy {
	public static void main(String[] args) {

		int highscore = calculatescore(true, 800, 5, 100);
		System.out.println("Your final score was " + highscore);

		highscore = calculatescore(true, 10000, 28, 200);
		System.out.println("Your final score was " + highscore);
	}

	public static int calculatescore(boolean newGameOver, int score, int newLevelCompleted, int newBonus) {

		if (newGameOver) {
			int finalScore = score + (newLevelCompleted * newBonus);
			finalScore += 1000;

			return finalScore;
		} else {
			return -1;
		}
	}

	public static void displayHighScoreposition(String playername, int newhighscore) {
		System.out.println(playername + "managed into high position" + newhighscore + "postion on the table");
	}

	public static int calculatehighscore(int playerscore) {
		if (playerscore < 1000) {
			return -1;
		} else if (playerscore > 500 && playerscore < 1000) {
			return 2;
		} else if (playerscore < 100 && playerscore < 500) {
			return 3;
		} else {
			return 4;

		}

	}

}