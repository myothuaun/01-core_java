package myy.core_java_assignments;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number = ");
		System.out.println("Enter your second number = ");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		System.out.println("user operation => + / - / */ %");
		int operation = sc.nextInt();
		switch(operation) {
		case 1:
			int addCalculate = add(firstNum, secondNum);
			System.out.println("first + second : "+addCalculate);
			break;
		case 2:
			int subCalculate = sub(firstNum, secondNum);
			System.out.println("first - second : "+subCalculate);
			break;
		case 3:
			int multCalculate = mult(firstNum, secondNum);
			System.out.println("first * second : "+multCalculate);
			break;
		case 4:
			int divCalculate = div(firstNum, secondNum);
			System.out.println("first / second : "+divCalculate);		
			break;
		}
	

	}
	public static int add(int firstNum, int secondNum) {
		int num = firstNum + secondNum;
		return num;
	}
	public static int sub(int firstNum, int secondNum) {
		int num = firstNum - secondNum;
		return num;
	}
	public static int mult(int firstNum, int secondNum) {
		int num = firstNum * secondNum;
		return num;
	}
	public static int div(int firstNum, int secondNum) {
		int num = firstNum / secondNum;
		return num;
	}

}
