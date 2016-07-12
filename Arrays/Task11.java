import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the elements of the array: ");
		int[] array = new int[7];

		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		for (int idx = 0; idx < array.length; idx++) {
			if ((array[idx] % 5 == 0) && (array[idx] > 5)) {
				System.out.print(array[idx] + " ");
			}
		}
	}

}
