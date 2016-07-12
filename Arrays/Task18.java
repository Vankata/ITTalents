import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the arrays: ");
		int size = sc.nextInt();

		int[] fArray = new int[size];
		int[] sArray = new int[size];
		System.out.print("Enter the elements of the first array: ");
		for (int idx = 0; idx < fArray.length; idx++) {
			fArray[idx] = sc.nextInt();
		}
		System.out.print("Enter the elements of the second array: ");
		for (int idx = 0; idx < sArray.length; idx++) {
			sArray[idx] = sc.nextInt();
		}

		int[] result = new int[size];
		for (int idx = 0; idx < size; idx++) {
			if (fArray[idx] > sArray[idx]) {
				result[idx] = fArray[idx];
			} else {

				result[idx] = sArray[idx];
			}
		}

		for (int idx = 0; idx < size; idx++) {
			System.out.print(fArray[idx] + " ");
		}
		System.out.println();
		for (int idx = 0; idx < size; idx++) {
			System.out.print(sArray[idx] + " ");
		}
		System.out.println();
		for (int idx = 0; idx < size; idx++) {
			System.out.print(result[idx] + " ");
		}

	}

}
