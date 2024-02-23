package conditions;

public class switch1 {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Excellent: Passed");
			break;
		case 'B':
		case 'C':
			System.out.println("Good: Passed");
			break;
		case 'D':
			System.out.println("Not Bad: Passed");
			break;
		case 'F':
			System.out.println("Unfortunate: Failed");
			break;
		default:
			System.out.println("Unvalid grade");

		}
	}
}
