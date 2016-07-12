import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the elements of the array: ");
		int[] array = new int[7];

		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;

		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];

		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		for (int idx = 0; idx < array.length; idx++) {
			System.out.print(array[idx] + " ");
		}

	}

}
