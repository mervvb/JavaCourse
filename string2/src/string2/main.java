package string2;

public class main {

	public static void main(String[] args) {
		String text = "The weather is so nice today.";
		System.out.println(text);

		String newText = text.replace("so", "very");
		System.out.println(newText);

		System.out.println(text.substring(3));
		System.out.println(text.substring(4, 11));

		for (String word : text.split(" ")) {
			System.out.println(word);
		}

		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());

		// for empty space
		System.out.println(text.trim());

	}

}
