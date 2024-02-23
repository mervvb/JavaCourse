package secondProject;

public class main2 {

	public static void main(String[] args) {
		char letter = 'A';

		switch (letter) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("The letter is thick vowel in Turkish language.");
			break;
		case 'E':
		case 'İ':
		case 'Ü':
		case 'Ö':
			System.out.println("The letter is thin vowel in Turkish language.");
			break;
		default:
			System.out.println("The letter is not thin vowel or thick vowel in Turkish language.");

		}

	}

}
