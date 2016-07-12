import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if ((number < 100) || (number > 999)) {
			System.out.println("Invalid input! ");
		} else {
			for (int i = 100; i < 1000; i++) {
				int firstDig = i / 100;
				int secDig = (i / 10) % 10;
				int thirdDig = i % 10;

				if (firstDig + secDig + thirdDig == number) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
