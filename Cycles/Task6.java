import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		int sum = 0;

		if (number <= 1) {
			for (int i = number; i <= 1; i++) {
				sum += i;
			}
		} else {
			for (int j = 1; j <= number; j++) {
				sum += j;
			}
		}

		System.out.println("Sum = " + sum);
	}

}
