import java.util.Scanner;


public class Task10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter char sequence: ");
		String sequence = new Scanner(System.in).nextLine();
		String newSequence = new String("");
		for (int idx = 0; idx < sequence.length(); idx++) {
			newSequence = newSequence + (char)(sequence.charAt(idx) + 5);
		}
		
		System.out.println(newSequence);
	}

}
