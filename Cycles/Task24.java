import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number(10-30000): ");
		int number = sc.nextInt();

		if ((number < 10) || (number > 30000)) {
			System.out.println("Invalid input! ");
		} else {
			int digits = 0;
			int temp = number;
			do {
				number /= 10;
				digits++;
			} while (number != 0);

			boolean flag = true;
			do {
				int firstDig = temp / (int) (Math.pow(10, (digits - 1)));
				int lastDig = (int) temp % 10;

				if (firstDig != lastDig) {
					flag = false;
				}

				temp %= Math.pow(10, (digits - 1));
				temp /= 10;
				digits -= 2;
			} while (temp > 9);
			System.out.println(flag);
		}
	}
}
