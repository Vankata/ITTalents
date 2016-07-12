import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int count = sc.nextInt();
		int start = 3;

		if (count < 1) {
			System.out.println("Invalid input! ");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.print(start + " ");
				start += 3;
			}
		}

	}

}
