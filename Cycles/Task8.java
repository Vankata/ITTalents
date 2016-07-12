import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (number < 1) {
			System.out.println("Invalid input! ");
		} else {
			if (number == 1) {
				System.out.println(0);
			} else {
				int temp = number - 1;
				for (int i = 0; i < number; i++) {
					for (int j = 0; j < number; j++) {
						System.out.print(temp);
					}
					temp += 2;
					System.out.println();
				}
			}
		}
	}
}
