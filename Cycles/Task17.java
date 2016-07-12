import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of the side of the square(3-20): ");
		int side = sc.nextInt();
		System.out.print("Enter a symbol: ");
		char symbol = sc.next().charAt(0);

		if ((side < 3) || (side > 20)) {
			System.out.println("Invalid input! ");
		} else {
			for (int i = 0; i < side; i++) {
				for (int j = 0; j < side; j++) {
					if ((i == 0) || (i == (side - 1))) {
						System.out.print("* ");
					} else {
						if ((j == 0) || (j == (side - 1))) {
							System.out.print("* ");
						} else {
							System.out.print(symbol + " ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}
