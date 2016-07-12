import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.print("Enter the elements of the array: ");
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		int temp = 1;
		int count = 1;
		for (int idx = 0; idx < array.length - 1; idx++) {
			if (array[idx] == array[idx + 1]) {
				count++;
			} else {
				if (count > temp) {
					temp = count;
				}
				count = 1;
			}
		}

		System.out.println("Longest row of numbers: " + temp);

	}

}
