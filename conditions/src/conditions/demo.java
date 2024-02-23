package conditions;

public class demo {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;

		int theBigestNumber = number1;

		if (theBigestNumber < number2) {
			theBigestNumber = number2;
		}

		if (theBigestNumber < number3) {
			theBigestNumber = number3;

		}

		System.out.println("The bigest number: " + theBigestNumber);

	}

}
