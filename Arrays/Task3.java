import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		long[] array = new long[10];
		array[0] = number;
		array[1] = number;

		for (int idx = 2; idx < 10; idx++) {
			array[idx] = array[idx - 2] + array[idx - 1];
		}

		for (int idx = 0; idx < array.length; idx++) {
			System.out.print(array[idx] + " ");
		}
	}

}
