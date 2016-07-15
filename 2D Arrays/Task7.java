public class Task7 {

	public static void main(String[] args) {

		int[][] matrix = { { 5, 8, 5, 0, 14, 3 }, 
						   { 1, 3, 5, 7, 21, 2 },
						   { 1, 2, 4, 4, 5, 27 }, 
						   { 5, 8, 5, 0, 13, 5 },
						   { 9, 8, 4, 0, 14, 3 }, 
						   { 6, 3, 21, 7, 1, 2 } };

		int sum = 0;
		int bigSum = 0;
		int count = 0;
		for (int idx = 0; idx < matrix.length; idx++) {
			if ((count + idx) % 2 == 0) {
				sum += matrix[count][idx];
				System.out.print(matrix[count][idx] + " ");
			}
			if (idx == matrix.length - 1) {
				count++;
				if (count != 6) {
					System.out.println("Sum: " + sum);
					bigSum += sum;
					sum = 0;
					idx = -1;
				} else {
					System.out.println("Sum: " + sum);
					bigSum += sum;
					System.out.print("Sum of all elements: " + bigSum);
				}
			}

		}
	}
}
