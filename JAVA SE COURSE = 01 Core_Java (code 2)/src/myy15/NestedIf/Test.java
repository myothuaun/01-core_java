package myy15.NestedIf;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 60;
		if(mark >= 0 && mark <= 100) {
			System.out.println("Continue check.....");
			if(mark>80) {
				System.out.println("Distinction, your grade is A");
			}else if(mark<40){
				System.out.println("you fail the Exam");
			}else {
				System.out.println("you pass the Exam");
			}
		
		}else {
			System.out.println("Invalid Input!");
		}
	}

}
