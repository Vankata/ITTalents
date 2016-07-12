import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the elements of the array: ");
		int[] array = new int[7];
		int sum = 0;
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
			sum += array[idx];
		}

		double avg = sum / 7;
		double temp = Math.abs(avg - array[0]);
		int idx = 0;

		for (int idx1 = 0; idx1 < array.length - 1; idx1++) {
			if (temp > Math.abs(avg - array[idx1])) {
				temp = Math.abs(avg - array[idx1]);
				idx = idx1;
			}
		}
		System.out.println("result: " + array[idx]);

	}

}
