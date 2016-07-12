import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		boolean flag = true;

		if (number < 2) {
			System.out.println("Invalid input! ");
			flag = false;
		} else {
			for (int i = 2; i < number; i++) {
				if ((number % i) == 0) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println(number + " is a prime number! ");
		} else {
			System.out.println(number + " is not a prime number! ");
		}
	}
}
