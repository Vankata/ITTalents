public class Task4 {

	public static void main(String[] args) {

		int[][] matrix = { { 5, 8, 5, 0 }, { 1, 3, 5, 7 }, { 1, 2, 4, 4 },
				{ 5, 8, 5, 0 } };

		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = matrix[rows].length - 1; cols >= 0; cols--) {
				System.out.print(matrix[cols][rows] + " ");
			}

			System.out.println();
		}

	}

}
