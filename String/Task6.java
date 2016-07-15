import java.util.Scanner;


public class Task6 {

	static boolean isValid(String validString) {

		boolean flag = true;
		for (int idx = 0; idx < validString.length(); idx++) {

			if (('a' > validString.charAt(idx) || validString.charAt(idx) > 'z') && ('A' > validString.charAt(idx) || validString.charAt(idx) > 'Z') && validString.charAt(idx) != ' ') {
				flag = false;
			}
		}

		return flag;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Enter words separated with space: ");
		String words = new Scanner(System.in).nextLine();
		while (!isValid(words)) {
			System.out.print("The words are invalid. Enter new words: ");
			words = new Scanner(System.in).nextLine();
		}
		
		String[] wordsArr = words.split(" ");
		
		for (int idx = 0; idx < wordsArr.length; idx++) {
			if(wordsArr[idx].equals(" ")){
				for (int idx1 = idx; idx1 < wordsArr.length - 1; idx1++) {
					wordsArr[idx1] = wordsArr[idx1 + 1];
				}
			}
		}
		
		for (int idx = 0; idx < wordsArr.length; idx++) {
			wordsArr[idx] = wordsArr[idx].toUpperCase();
			wordsArr[idx] = wordsArr[idx].replaceFirst(wordsArr[idx].substring(1, wordsArr[idx].length()), wordsArr[idx].substring(1, wordsArr[idx].length()).toLowerCase());
		}
		
		for (int idx = 0; idx < wordsArr.length; idx++) {
			System.out.print(wordsArr[idx] + " ");
		}

	}

}
