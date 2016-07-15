import java.util.Scanner;

public class Task3 {

	static boolean isValid(String validString) {
		if (validString.contains(" ")) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.print("Enter first char sequence(space not allowed): ");
		String fSequence = new Scanner(System.in).nextLine();
		while (!isValid(fSequence)) {
			System.out
					.print("Sequence not valid! Enter another char sequence: ");
			fSequence = new Scanner(System.in).nextLine();
		}

		System.out.print("Enter second char sequence (space not allowed): ");
		String sSequence = new Scanner(System.in).nextLine();
		while (!isValid(sSequence)) {
			System.out
					.print("Sequence not valid! Enter another char sequence: ");
			sSequence = new Scanner(System.in).nextLine();
		}

		int smaller = 0;
		boolean flag = false;
		boolean flag1 = false;
		if (fSequence.length() < sSequence.length()) {
			System.out.println("First char sequence is shorter than the second one! ");
			smaller = fSequence.length();
		} else {
			if (fSequence.length() > sSequence.length()) {
				System.out.println("First char sequence is longer than the second one! ");
				smaller = sSequence.length();
				flag1 = true;
			} else {
				System.out
						.println("Both char sequences have the same length! ");
				flag = true;
			}
		}

		System.out.println("Differences: ");
		if (flag) {
			for (int idx = 0; idx < fSequence.length(); idx++) {
				if (fSequence.charAt(idx) != sSequence.charAt(idx)) {
					System.out.println(idx + " " + fSequence.charAt(idx) + "-" + sSequence.charAt(idx));
				}
			}
		} else {
			for (int idx = 0; idx < smaller; idx++) {
				if (fSequence.charAt(idx) != sSequence.charAt(idx)) {
					System.out.println(idx + " " + fSequence.charAt(idx) + "-" + sSequence.charAt(idx));
				}
			}
			if(flag1){
				for (int idx = smaller; idx < fSequence.length(); idx++) {
					System.out.println(idx + " " + fSequence.charAt(idx) + "-" + "no symbol");
				}
			}else{
				for (int idx = smaller; idx < sSequence.length(); idx++) {
					System.out.println(idx + " "  + "no symbol" + "-" + sSequence.charAt(idx));
				}
			}

		}

	}

}
