package recaparrays;

public class main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 3.6, 7, 8.9 };
		double theBigestNumber = myList[0];
		if (theBigestNumber < myList[1]) {
			theBigestNumber = myList[1];
		}
		if (theBigestNumber < myList[2]) {
			theBigestNumber = myList[2];
		}
		if (theBigestNumber < myList[3]) {
			theBigestNumber = myList[3];
		}
		System.out.println("The bigest number:" + theBigestNumber);

		double total = 0;
		for (double number : myList) {
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Total:" + total);

	}

}
