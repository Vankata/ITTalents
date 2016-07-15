import java.util.Scanner;

public class Task1 {

	static boolean isValid(String validString) {

		if (validString.length() > 40) {
			return false;
		}
		boolean flag = true;
		for (int idx = 0; idx < validString.length(); idx++) {

			if (('a' > validString.charAt(idx) || validString.charAt(idx) > 'z') && ('A' > validString.charAt(idx) || validString.charAt(idx) > 'Z')) {
				flag = false;
			}

		}

		return flag;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.print("Enter first string(only letters / no more than 40): ");
		String fString = new Scanner(System.in).nextLine();
		while (!isValid(fString)) {
			System.out.print("String is not valid. Enter another string(only letters / no more than 40): ");
			fString = new Scanner(System.in).nextLine();
		}

		System.out.print("Enter second string(only letters): ");
		String sString = new Scanner(System.in).nextLine();
		while (!isValid(sString)) {
			System.out.print("String is not valid. Enter another string(only letters / no more than 40): ");
			sString = new Scanner(System.in).nextLine();
		}

		System.out.print(fString.toLowerCase() + "\n" + fString.toUpperCase()
				+ "\n" + sString.toLowerCase() + "\n" + sString.toUpperCase());

	}

}
