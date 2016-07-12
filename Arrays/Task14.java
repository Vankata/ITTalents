import java.util.Scanner;

public class Task14 {

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

		int countElems = 0;
		for (int idx = 0; idx < array.length; idx++) {
			if (array[idx] >= -2.99 && array[idx] <= 2.99) {
				countElems++;
			}
		}
		double[] newArr = new double[countElems];

		int idx = 0;
		for (int idx1 = 0; idx1 < array.length; idx1++) {
			if (array[idx1] >= -2.99 && array[idx1] <= 2.99) {
				newArr[idx] = array[idx1];
				idx++;
			}
		}

		for (int idx1 = 0; idx1 < newArr.length; idx1++) {
			System.out.print(newArr[idx1] + " ");
		}

	}

}
