import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];

		System.out.print("Enter the elements of the array: ");
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextDouble();
		}

		for (int idx = 0; idx < array.length; idx++) {
			System.out.print(array[idx] + " ");
		}
		System.out.println();

		int helpIdx = 1;
		for (int idx = 0; idx < array.length; idx++) {
			if (array[idx] < -0.231) {
				array[idx] = helpIdx * helpIdx + 41.25;
				helpIdx++;
			} else {
				array[idx] *= helpIdx;
				helpIdx++;
			}
		}

		for (int idx = 0; idx < array.length; idx++) {
			System.out.print(array[idx] + " ");
		}

	}

}
