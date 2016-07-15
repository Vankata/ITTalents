public class Task6 {

	public static void main(String[] args) {

		int[][] matrix = { { 5, 8, 5, 0, 14, 3 }, 
						   { 1, 3, 5, 7, 21, 2 },
						   { 1, 2, 4, 4, 5, 27 }, 
						   { 5, 8, 5, 0, 13, 5 },
						   { 9, 8, 4, 0, 14, 3 }, 
						   { 6, 3, 21, 7, 1, 2 } };

		int sum = 0;
		int bigSum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				if (row % 2 == 1) {
					sum += matrix[row][col];
					System.out.print(matrix[row][col] + " ");
				}
			}
			if (row % 2 == 1) {
				System.out.println("Sum: " + sum);
				bigSum += sum;
				sum = 0;
			}
		}
		System.out.println("Sum of all elements: " + bigSum);
	}

}
