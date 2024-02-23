package firstProject;

public class main {

	public static void main(String[] args) {

		int number = 1;
		boolean isItPrimeNumber = true;

		if (number > 2) {
			for (int i = 2; i < number; i++) {
				// remainder(%)
				if (number % i == 0) {
					isItPrimeNumber = false;
				}
			}
			System.out.println("Is it prime number: " + isItPrimeNumber);
		} else if (number <= 1) {
			System.out.println("It is not searched whether it is a prime number or not.");
		} else {
			isItPrimeNumber = true;
			System.out.println("Is it prime number: " + isItPrimeNumber);
		}

	}

}
