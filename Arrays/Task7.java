import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] array = new int[size];
		int[] newArr = new int[size];

		System.out.print("Enter the elements of the array: ");
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		newArr[0] = array[0];
		newArr[size - 1] = array[size - 1];

		for (int idx = 1; idx < newArr.length - 1; idx++) {
			newArr[idx] = array[idx - 1] + array[idx + 1];
		}

		for (int idx = 0; idx < newArr.length; idx++) {
			System.out.print(newArr[idx] + " ");
		}

	}

}
