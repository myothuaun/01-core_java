package myy35.GuessMyNumberExercise;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int secretNum = ran.nextInt(100);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your guess number = ");
		int guessNum = sc.nextInt();
		while(guessNum!=secretNum) {
			if(guessNum>secretNum) {
				System.out.println("your number is greater! \nGuess my Number=");
			}else {
				System.out.println("your number is lessthan! \nGuess my Number=");
			}
			guessNum = sc.nextInt();
				
		}
		System.out.println("Correct!");
	}

}
