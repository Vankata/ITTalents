import java.util.Scanner;


public class Task2 {

	static boolean isValid(String validString) {

		if (validString.length() < 10 || validString.length() > 20) {
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
		
		System.out.print("Enter the first word(between 10 and 20 symbols): ");
		String fWord = new Scanner(System.in).nextLine();
		while(!isValid(fWord)){
			System.out.print("The word is invalid. Enter another word(between 10 and 20 symbols): ");
			fWord = new Scanner(System.in).nextLine();
		}
		
		System.out.print("Enter the second word(between 10 and 20 symbols): ");
		String sWord = new Scanner(System.in).nextLine();
		while(!isValid(sWord)){
			System.out.print("The word is invalid. Enter another word(between 10 and 20 symbols): ");
			sWord = new Scanner(System.in).nextLine();
		}
		
		String temp1 = fWord.substring(0, 5);
		String temp2 = sWord.substring(0, 5);
		
		fWord = fWord.replaceFirst(temp1, temp2);
		sWord = sWord.replaceFirst(temp2, temp1);

		if(fWord.length() < sWord.length()){
			System.out.println(sWord.length() + " " + sWord);
		}else
		{
			if(fWord.length() > sWord.length()){
				System.out.println(fWord.length() + " " + fWord);
			}else{
				System.out.println(sWord.length() + " " + sWord);
				System.out.println(fWord.length() + " " + fWord);
			}
		}
		
	}

}
