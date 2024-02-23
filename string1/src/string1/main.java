package string1;

public class main {

	public static void main(String[] args) {
		String text = "The weather is so nice today.";
		System.out.println(text);

		System.out.println("Number of elements: " + text.length());
		System.out.println("5th element: " + text.charAt(4));
		System.out.println(text.concat("Hurrah!"));
		// boolean value
		System.out.println(text.startsWith("T"));
		System.out.println(text.endsWith("."));

		char[] characters = new char[5];
		text.getChars(0, 3, characters, 0);
		System.out.println(characters);

		System.out.println(text.indexOf("o"));
		System.out.println(text.lastIndexOf("o"));

	}

}
