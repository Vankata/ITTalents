import java.util.Scanner;

public class Task9 {

	static boolean isValid(String validString) {

		boolean flag = true;
		for (int idx = 0; idx < validString.length(); idx++) {

			if (('a' > validString.charAt(idx) || validString.charAt(idx) > 'z')
					&& ('A' > validString.charAt(idx) || validString.charAt(idx) > 'Z')
					&& ('0' > validString.charAt(idx) || validString.charAt(idx) > '9')
					&& validString.charAt(idx) != '-') {
				flag = false;
			}
		}

		return flag;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.print("Enter char sequence (only letters, numbers and -): ");
		String sequence = new Scanner(System.in).nextLine();
		while (!isValid(sequence)) {
			System.out
					.print("The sequence is invalid. Enter new char sequence: ");
			sequence = new Scanner(System.in).nextLine();
		}

		sequence = sequence.replaceAll("[^-?0-9]+", " ");
		String[] numbsArr = sequence.split(" ");

		int sum = 0;
		for (int idx = 1; idx < numbsArr.length; idx++) {
			System.out.println(numbsArr[idx]);
			sum += Integer.parseInt(numbsArr[idx]);
		}

		System.out.println("Sum: " + sum);

	}

}
