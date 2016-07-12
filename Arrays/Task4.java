import java.util.Scanner;

public class Task4 {

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

		boolean flag = true;
		for (int idx = 0; idx < array.length / 2; idx++) {
			if (array[idx] != array[array.length - idx - 1]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("The array is symetrical!");
		} else {
			System.out.println("THe array is not symetrical!");
		}

	}

}
