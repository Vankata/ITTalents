import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		System.out.print("Enter the elements of the array: ");
		int[] array = new int[size];
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		int temp = array[0];
		for (int idx = 0; idx < array.length / 2; idx++) {
			temp = array[idx];
			array[idx] = array[array.length - idx - 1];
			array[array.length - idx - 1] = temp;
		}

		for (int idx = 0; idx < array.length; idx++) {
			System.out.print(array[idx] + " ");
		}

	}

}
