import java.util.Scanner;

public class Task9Practise {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the matrix: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.print("Enter the elements of the matrix: ");
		int[][] matrix = new int[rows][cols];
		for (int idx = 0; idx < rows; idx++) {
			for (int idx1 = 0; idx1 < cols; idx1++) {
				matrix[idx][idx1] = sc.nextInt();
			}
		}

		int sum = 0;
		int tempSum = 0;
		int tempIdx = -1;
		int tempIdx1 = -1;

		for (int idx = 0; idx < rows - 1; idx++) {
			for (int idx1 = 0; idx1 < cols - 1; idx1++) {
				sum = matrix[idx][idx1] + matrix[idx][idx1 + 1]
						+ matrix[idx + 1][idx1] + matrix[idx + 1][idx1 + 1];
				if (sum > tempSum) {
					tempSum = sum;
					tempIdx = idx;
					tempIdx1 = idx1;

					sum = 0;
				}
			}
		}

		System.out.println(matrix[tempIdx][tempIdx1] + " "
				+ matrix[tempIdx][tempIdx1 + 1] + "\n"
				+ matrix[tempIdx + 1][tempIdx1] + " "
				+ matrix[tempIdx + 1][tempIdx1 + 1]);
	}

}
