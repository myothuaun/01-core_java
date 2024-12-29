package myy29.ScannerClass;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //declare and instantiate
		System.out.println("Enter your name = ");
		System.out.println("Enter your city = ");
		String name = sc.nextLine();  //String return
		String city = sc.nextLine(); 
		System.out.println(name);
		System.out.println(city);
	}

}
