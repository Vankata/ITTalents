import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number(10-99): ");
		int number = sc.nextInt();

		if ((number < 10) || (number > 99)) {
			System.out.println("Invalid input! ");
		} else {
			boolean flag = true;
			while (flag) {
				if ((number % 2) != 0) {
					System.out.print(((3 * number) + 1) + " ");
					number = (3 * number) + 1;
				} else {
					System.out.print((number / 2) + " ");
					number = number / 2;
				}

				if (number == 1) {
					flag = false;
				}
			}
		}
	}

}
