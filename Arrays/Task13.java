import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int[] array = new int[32];
		int idx = 0;

		while (num != 0) {
			array[idx] = num % 2;
			num /= 2;
			idx++;
		}

		for (int idx1 = array.length - 1; idx1 >= 0; idx1--) {
			System.out.print(array[idx1]);
		}
	}

}
