package arrays;

public class main {

	public static void main(String[] args) {

		String[] students = new String[3];
		students[0] = "Hasan";
		students[1] = "Berk";
		students[2] = "Melike";
		// method 1
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		// method 2
		for (String student : students) {
			System.out.println(student);
		}

	}

}
