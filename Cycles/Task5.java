import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();

		System.out.print("Enter second number: ");
		int secNum = sc.nextInt();

		if (firstNum <= secNum) {
			for (int i = firstNum; i <= secNum; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int j = secNum; j <= firstNum; j++) {
				System.out.print(j + " ");
			}
		}
	}

}
