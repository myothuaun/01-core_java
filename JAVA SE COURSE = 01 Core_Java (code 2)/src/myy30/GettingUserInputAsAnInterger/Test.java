package myy30.GettingUserInputAsAnInterger;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age = ");
		String ageStr = sc.nextLine();
		System.out.println("Enter your name = ");
		String name = sc.nextLine();
		int age = Integer.parseInt(ageStr);
		if(age>18) {
			System.out.println("you are adult");
		}else {
			System.out.println("you are still young");
		}
	}

}
