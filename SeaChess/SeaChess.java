import java.util.Scanner;

public class SeaChess {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		char[][] arr = new char[5][5];
		arr[0][1] = '|';
		arr[0][3] = '|';
		arr[2][1] = '|';
		arr[2][3] = '|';
		arr[4][1] = '|';
		arr[4][3] = '|';
		arr[0][0] = 0;
		arr[0][2] = 0;
		arr[0][4] = 0;
		arr[2][0] = 0;
		arr[2][2] = 0;
		arr[2][4] = 0;
		arr[4][0] = 0;
		arr[2][2] = 0;
		arr[4][4] = 0;

		for (int i = 0; i < 5; i++) {
			arr[1][i] = '-';
		}
		for (int i = 0; i < 5; i++) {
			arr[3][i] = '-';
		}

		System.out.println("First player plays with X");
		System.out.println("Second player plays with O");

		boolean flag = true;
		boolean turn = true;
		boolean winner = false;

		while (flag) {

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr[i][j] == 0) {
						System.out.print(" ");
					} else {
						System.out.print(arr[i][j]);
					}
				}
				System.out.println();
			}

			if (turn) {
				System.out.println("Player 1\' turn! Select coordinates! ");
				turn = false;
			} else {
				System.out.println("Player 2\' turn! Select coordinates! ");
				turn = true;
			}

			System.out
					.print("Enter coordinates(only even numbers from 0 to 4: ");
			int firstC = sc.nextInt();
			int secC = sc.nextInt();

			if (!turn) {
				arr[firstC][secC] = 'X';
			} else {
				arr[firstC][secC] = 'O';
			}

			for (int i = 0; i < 5; i += 2) {
				if ((arr[i][0] == arr[i][2]) && (arr[i][0] == arr[i][4])
						&& (arr[i][2] == arr[i][4]) && (arr[i][0] != 0)) {
					winner = true;
					flag = false;
				}
				if ((arr[0][i] == arr[2][i]) && (arr[0][i] == arr[4][i])
						&& (arr[2][i] == arr[4][i]) && (arr[0][i] != 0)) {
					flag = false;
					winner = true;
				}
			}

			if ((arr[0][0] == arr[2][2]) && (arr[0][0] == arr[4][4])
					&& (arr[2][2] == arr[4][4]) && (arr[0][0] != 0)) {
				winner = true;
				flag = false;
			}
			if ((arr[4][0] == arr[2][2]) && (arr[4][0] == arr[0][4])
					&& (arr[2][2] == arr[0][4]) && (arr[4][0] != 0)) {
				winner = true;
				flag = false;
			}

			if (winner) {
				if (!turn) {
					System.out.println("First player wins! ");

					for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							if (arr[i][j] == 0) {
								System.out.print(" ");
							} else {
								System.out.print(arr[i][j]);
							}
						}
						System.out.println();
					}
				} else {
					System.out.println("Second player wins! ");

					for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							if (arr[i][j] == 0) {
								System.out.print(" ");
							} else {
								System.out.print(arr[i][j]);
							}
						}
						System.out.println();
					}
				}
			} else {
				int count = 0;
				for (int i = 0; i < 5; i += 2) {
					if ((arr[i][0] != 0) && (arr[i][2] != 0)
							&& (arr[i][4] != 0)) {
						count++;
						if (count == 3) {
							flag = false;
							System.out.println("No winner!");
							for (int k = 0; k < 5; k++) {
								for (int j = 0; j < 5; j++) {
									System.out.print(arr[k][j]);
								}
								System.out.println();
							}
						}
					}
				}
			}
		}
	}
}
