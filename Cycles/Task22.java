import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number(1-999): ");
		int number = sc.nextInt();

		if ((number < 1) || (number > 999)) {
			System.out.println("Invalid input! ");
		} else {
			int count = 0;
			int i = number;
			while(count < 10) {
				if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0)) {
					count++;
					if (count == 10) {
						System.out.print(count + ":" + i);
					} else {
						System.out.print(count + ":" + i + ",");
					}
				}
				i++;
			}
		}
	}
}
