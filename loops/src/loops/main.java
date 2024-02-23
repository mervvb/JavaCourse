package loops;

public class main {

	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 11; i += 2) {
			System.out.println(i);
		}
		System.out.println("The cycle is over.");

		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("The cycle is over.");

		// Do-While
		// condition not required
		int j = 300;
		do {
			System.out.println("logged");
			System.out.println(j);
			j += 2;
		} while (j < 10);
	}
}
