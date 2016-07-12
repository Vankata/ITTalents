import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int sum = 0;

		if (number < 1) {
			System.out.println("Invalid input! ");
		} else {
			int count = 1;
			while (count <= number) {
				sum += count;
				count++;
			}
			System.out.println(sum);
		}
	}

}
