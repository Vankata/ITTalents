import java.util.Scanner;

public class Task5 {

	static boolean isValid(String validString) {

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

		System.out.print("Enter the first word: ");
		String fWord = new Scanner(System.in).nextLine();
		while (!isValid(fWord)) {
			System.out.print("The word is invalid. Enter another word: ");
			fWord = new Scanner(System.in).nextLine();
		}

		System.out.print("Enter the second word: ");
		String sWord = new Scanner(System.in).nextLine();
		while (!isValid(sWord)) {
			System.out.print("The word is invalid. Enter another word: ");
			sWord = new Scanner(System.in).nextLine();
		}

		boolean flag = false;
		int tempIdx = -1;
		int tempIdx1 = -1;
		for (int idx = 0; idx < sWord.length(); idx++) {
			for (int idx1 = 0; idx1 < fWord.length(); idx1++) {
				if (sWord.charAt(idx) == fWord.charAt(idx1)) {
					flag = true;
					tempIdx = idx1;
					tempIdx1 = idx;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		if (!flag) {
			System.out.println("The words do not have common letters! ");
		} else {
			for (int idx = 0; idx < fWord.length(); idx++) {
				if (idx == tempIdx) {
					System.out.println(sWord);
				} else {
					for (int idx1 = 0; idx1 < tempIdx1; idx1++) {
						System.out.print(" ");
					}
					System.out.println(fWord.charAt(idx));
				}
			}

		}

	}

}
