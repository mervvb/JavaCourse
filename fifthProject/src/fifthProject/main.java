package fifthProject;

public class main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 4, 5 };
		int desiredNumber = 3;
		boolean isIt = true;
		for (int number : numbers) {
			if (number == desiredNumber) {
				isIt = true;
			}

		}
		if (isIt) {
			System.out.println("The number is in the list.");
		} else {
			System.out.println("The number is not in the list.");
		}

	}

}
