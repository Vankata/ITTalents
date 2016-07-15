import java.util.Scanner;

public class Task10PractisePart2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.print("Enter the elements of the matrix: ");

		// first way
		int[][] matrix = new int[rows][cols];
		for (int idx = 0; idx < matrix.length; idx++) {
			for (int idx1 = 0; idx1 < matrix[idx].length; idx1++) {
				matrix[idx][idx1] = sc.nextInt();
			}
		}
		for (int idx = 0; idx < matrix.length; idx++) {
			for (int idx1 = 0; idx1 < matrix[idx].length; idx1++) {
				System.out.print(matrix[idx][idx1] + " ");
			}
			System.out.println();
		}

	}

}
