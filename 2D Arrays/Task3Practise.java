import java.util.Scanner;

public class Task3Practise {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the char array: ");
		int size = sc.nextInt();

		char[] array = new char[size];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next().charAt(0);
		}

		System.out.println("Enter a single char: ");
		char ch = sc.next().charAt(0);

		boolean flag = false;
		int idx = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ch) {
				flag = true;
				idx = i;
				break;
			}
		}

		if (flag) {
			System.out.println("The array contains the char at index " + idx);
		} else {
			System.out.println("The array does not contain the char! ");
		}

	}

}
