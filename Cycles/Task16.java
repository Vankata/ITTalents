import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers (10 - 5555): ");
		int firstNum = sc.nextInt();
		int secNum = sc.nextInt();

		if ((firstNum < 10) || (firstNum > 5555) || (secNum < 10)
				|| (secNum > 5555)) {
			System.out.println("Invalid input! ");
		} else {
			if (firstNum > secNum) {
				for (int i = firstNum; i >= secNum; i--) {
					if (i % 50 == 0) {
						System.out.print(i + " ");
					}
				}

			} else {
				for (int i = secNum; i >= firstNum; i--) {
					if (i % 50 == 0) {
						System.out.print(i + " ");
					}
				}
			}
		}

	}

}
