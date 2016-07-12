import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two number(from 1 to 9):");
		int firstNum = sc.nextInt();
		int secNum = sc.nextInt();

		if ((firstNum < 1) || (firstNum > 9) || (secNum < 1) || (secNum > 9)) {
			System.out.println("Invalid input! ");
		} else {
			for (int i = 1; i < (firstNum * secNum); i++) {
				for (int j = 1; j < (firstNum * secNum); j++) {
					if ((i * j <= firstNum * secNum) && (i <= firstNum)
							&& (j <= secNum)) {
						System.out.println(i + "*" + j + " = " + (i * j));
					}
				}
			}
		}
	}
}
