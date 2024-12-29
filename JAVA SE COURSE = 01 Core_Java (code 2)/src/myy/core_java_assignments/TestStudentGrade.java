package myy.core_java_assignments;

import java.util.Scanner;

public class TestStudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yout exam marks = ");
		int result = sc.nextInt();
			if(0<result&& result<40) {
				System.out.println("your fail the exam!");
			}else if(result>40 && result<60) {
				System.out.println("your grade is C");
			}else if(result>60 && result<80) {
				System.out.println("yout grade is B");
			}else if(result>80 && result<100) {
				System.out.println("your grade is A");
			}else {
				System.out.println("please enter your  correct marks!");
			}

	}

}
