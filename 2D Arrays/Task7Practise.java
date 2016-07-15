import java.util.Scanner;


public class Task7Practise {

	
	public static void main(String[] args) {
		

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.print("Enter the elements of the array: ");
		int[][] matrix = new int[rows][cols];
		for (int idx = 0; idx < rows; idx++) {
			for (int idx1 = 0; idx1 < cols; idx1++) {
				matrix[idx][idx1] = sc.nextInt();
			}
		}

		long product = 1;
		for (int idx = 0; idx < rows; idx++) {
			for (int idx1 = 0; idx1 < cols; idx1++) {
				if ((idx > idx1)) {
					product *= matrix[idx][idx1];
				}
			}
		}

		System.out.println("The product of the elements below the diagonal is: " + product);
	}

}
