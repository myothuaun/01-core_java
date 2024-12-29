package myy33.MileToKiloExercise;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mile = ");
		int mile = sc.nextInt();
		double kilometer = mile * 1.60934;
		System.out.println(mile+" miles => Kilometer is => "+kilometer);
	}

}
