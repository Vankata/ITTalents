import java.util.Scanner;


public class Task4Practise {


	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		System.out.print("Enter the elements of the array(only 0 and 1): ");
		int[] array = new int[size];
		int[] newArray = new int[size];
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}

		int idx1 = 0;
		int idx2 = array.length - 1;
		for (int idx = 0; idx < array.length; idx++) {
			if (array[idx] == 0) {
				newArray[idx1] = 0;
				idx1++;
			} else {
				newArray[idx2] = 1;
				idx2--;
			}
		}

		for (int idx = 0; idx < newArray.length; idx++) {
			System.out.print(newArray[idx]);
		}

	}

}
