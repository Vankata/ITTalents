import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		long factorial = 1;
		int idx = 1;

		do {
			factorial *= idx;
			idx++;
		} while (idx <= number);

		System.out.println(number + " factorial: " + factorial);
	}
}
