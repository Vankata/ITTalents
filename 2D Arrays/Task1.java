
public class Task1 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 12, 2, 34, 5 }, 
						   { 14, 27, 4, 67, 3 },
				           { 3, 25, 14, 5, 0 }, 
				           { 37, 5, 1, 50, 12 },
				           { 22, 11, 34, 78, -2 }, 
				           { 6, 7, 16, 32, 42 } };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int rows = 0; rows < 6; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				if (min > matrix[rows][cols]) {
					min = matrix[rows][cols];
				}
				if (max < matrix[rows][cols]) {
					max = matrix[rows][cols];
				}
			}
		}

		System.out.println("Min value in matrix: " + min
				+ "\nMax value in matrix: " + max);
	}

}
