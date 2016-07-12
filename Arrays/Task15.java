import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		double[] array = new double[size];
		System.out.print("Enter the elements of the array: ");
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextDouble();
		}

		double temp = 0;
		for (int idx = 0; idx < array.length - 1; idx++) {
			for (int idx1 = idx; idx1 < array.length; idx1++) {
				if (Math.abs(array[idx]) > Math.abs(array[idx1])) {
					temp = array[idx];
					array[idx] = array[idx1];
					array[idx1] = temp;
				}
			}
		}

		System.out.print(array[array.length - 3] + " "
				+ array[array.length - 2] + " " + array[array.length - 1]);

	}

}
