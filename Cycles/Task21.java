import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number(1-52): ");
		int number = sc.nextInt();

		if ((number < 1) || (number > 52)) {
			System.out.println("Invalid input! ");
		} else {
			int temp = number;
			int help;

			if (number % 4 != 0) {
				help = (number / 4) + 1;
			} else {
				help = number / 4;
			}

			for (int i = help; i <= 13; i++) {
				for (int j = 0; j <= 4; j++) {
					switch (i) {
					case 1:
						System.out.print("Dvoika");
						break;
					case 2:
						System.out.print("Troika");
						break;
					case 3:
						System.out.print("Chetvorka");
						break;
					case 4:
						System.out.print("Petica");
						break;
					case 5:
						System.out.print("Shestica");
						break;
					case 6:
						System.out.print("Sedmica");
						break;
					case 7:
						System.out.print("Osmica");
						break;
					case 8:
						System.out.print("Devqtka");
						break;
					case 9:
						System.out.print("Desqtka");
						break;
					case 10:
						System.out.print("Vale");
						break;
					case 11:
						System.out.print("Dama");
						break;
					case 12:
						System.out.print("Pop");
						break;
					case 13:
						System.out.print("Aso");
						break;
					}

					switch (temp % 4) {
					case 0:
						if (temp == 52) {
							System.out.print(" Pika");
						} else {
							System.out.print(" Pika, ");
						}
						j = 5;
						temp++;
						break;
					case 1:
						System.out.print(" Spatiq, ");
						j = 1;
						temp++;
						break;
					case 2:
						System.out.print(" Karo, ");
						j = 2;
						temp++;
						break;
					case 3:
						System.out.print(" Kupa, ");
						j = 3;
						temp++;
						break;
					}
				}
			}
		}
	}
}
