import java.util.Scanner;


public class Task8 {

	static boolean isValid(String validString) {

		boolean flag = true;
		for (int idx = 0; idx < validString.length(); idx++) {

			if (validString.charAt(idx) == ' ') {
				flag = false;
			}
		}

		return flag;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Enter char sequence: ");
		String sequence = new Scanner(System.in).nextLine();
		while (!isValid(sequence)) {
			System.out.print("The sequence is invalid. Enter new char sequence: ");
			sequence = new Scanner(System.in).nextLine();
		}
		
		int idx1 = sequence.length() - 1;
		boolean flag = true;
		for (int idx = 0; idx < sequence.length() / 2; idx++) {
			if(sequence.charAt(idx) != sequence.charAt(idx1)){
				flag = false;
				break;
			}
			idx1--;
		}
		
		if(flag){
			System.out.println("The sequence is palindrome! ");
		}else{
			System.out.println("The sequence is not palindrome! ");
		}

	}

}
