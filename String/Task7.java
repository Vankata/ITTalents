import java.util.Scanner;


public class Task7 {

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
		
		int countWords = 0;
		int tempLongestWord = 0;
		
		for (int idx = 0; idx < wordsArr.length; idx++) {
			if(tempLongestWord < wordsArr[idx].length()){
				tempLongestWord = wordsArr[idx].length();
			}
			countWords++;
		}
		
		System.out.println(countWords + " words, longest of which is with " + tempLongestWord + " symbols");
	}

}
