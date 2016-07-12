import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Enter array elements: ");

		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		int temp = 1;

		for (int idx = 0; idx < array.length; idx++) {
			if (array[idx] % 3 == 0) {
				temp = array[idx];
				break;
			}
		}

		for (int idx = 0; idx < array.length; idx++) {
			if ((array[idx] % 3 == 0) && (array[idx] < temp)) {
				temp = array[idx];
			}
		}

		if (temp == 1) {
			System.out.println("No number can be divided by 3! ");
		} else {
			System.out
					.println("The smallest number that can be divided by 3 is "
							+ temp + "!");
		}

	}

}
