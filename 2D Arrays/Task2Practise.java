import java.util.Scanner;

public class Task2Practise {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		System.out.print("Enter the elements of the array: ");
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		boolean flag = true;
		for (int i = 1; i < array.length - 1; i += 2) {
			if (!(array[i - 1] < array[i]) || !(array[i] > array[i + 1])) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("The array is sharp! ");
		} else {
			System.out.println("The array is not sharp! ");
		}

	}

}
