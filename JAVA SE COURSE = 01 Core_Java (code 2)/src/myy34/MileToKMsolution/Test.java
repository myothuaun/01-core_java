package myy34.MileToKMsolution;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mile = ");
		int mile = sc.nextInt();
		System.out.println(convertToKm(mile));
	}
	public static double convertToKm(int mile) {
		double kilometer = mile * 1.60934;
		return kilometer;
	}

}
