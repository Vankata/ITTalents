import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number(10-200): ");
		int number = sc.nextInt();

		if ((number < 10) || (number > 200)) {
			System.out.println("Ivalid input! ");
		} else {
			for (int i = number; i >= 10; i--) {
				if ((i % 7) == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
