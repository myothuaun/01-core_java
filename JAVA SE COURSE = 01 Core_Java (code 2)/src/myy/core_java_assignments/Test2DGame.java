package myy.core_java_assignments;

import java.util.Random;
import java.util.Scanner;

public class Test2DGame {
	public static void main(String []args) {
		Random ran = new Random();
		int randomNumber = ran.nextInt(100); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your guess number = ");
		int guessNumber = sc.nextInt();
		while(guessNumber != randomNumber) {
			if(guessNumber>randomNumber) {
				System.out.println("your guess number greater\n enter guess number ");
			}else {
				System.out.println("your guess number is less\n enter guess number");
				 
			}
			guessNumber = sc.nextInt();
			
		}
		System.out.println("your guess number is correct");
	}

}
