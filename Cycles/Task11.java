import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int count = number - 1;

		// filled
		for (int i = 0; i <= number; i++) {
			for (int j = 0; j <= count; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (number - 2 * count); k++) {
				System.out.print("*");
			}
			for (int j = 0; j <= count; j++) {
				System.out.print(" ");
			}
			count--;
			System.out.println();
		}

		// empty
		int secCount = number - 1;

		for (int i = 0; i <= number; i++) {
			for (int j = 0; j <= secCount; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (number - 2 * secCount); k++) {
				if (i != number) {
					if ((k == 0) || (k == (number - 1 - 2 * secCount))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}

			}
			for (int j = 0; j <= secCount; j++) {
				System.out.print(" ");
			}
			secCount--;
			System.out.println();
		}
	}
}
