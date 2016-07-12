import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] array = new int[size];
		int[] newArr = new int[size];

		System.out.print("Enter array elements: ");

		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		for (int idx = 0; idx < newArr.length / 2; idx++) {
			newArr[idx] = array[idx];
			newArr[(newArr.length / 2) + idx] = array[(newArr.length / 2) - idx - 1];
		}

		for (int idx = 0; idx < newArr.length; idx++) {
			System.out.print(newArr[idx] + " ");
		}

	}

}
