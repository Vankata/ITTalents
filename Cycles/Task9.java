import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();

		System.out.print("Enter second number: ");
		int secNum = sc.nextInt();

		int sum = 0;

		for (int i = firstNum; i <= secNum; i++) {
			if ((i % 3) == 0) {
				if (sum > 200) {
					System.out.print("skip " + i);
					break;
				} else {
					System.out.print("skip " + i + ",");
				}
			} else {
				sum += i * i;

				if (sum > 200) {
					System.out.print(i * i);
					break;
				} else {
					if (i != secNum) {
						System.out.print(i * i + ",");

					} else {
						System.out.print(i * i);
					}
				}
			}
		}
	}
}
