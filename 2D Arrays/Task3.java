
public class Task3 {

	
	public static void main(String[] args) {
	
		int[][] matrix = { { 1, 12, 2, 34, 5 }, 
				   		   { 14, 27, 4, 67, 3 },
		                   { 3, 25, 14, 5, 0 }, 
		                   { 37, 5, 1, 50, 12 },
		                   { 22, 11, 34, 78, -2 }, 
		                   { 6, 7, 16, 32, 42 } };
		
		int sum = 0;
		
		for (int rows = 0; rows < 6; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				sum += matrix[rows][cols];
			}
		}
		
		System.out.println("The sum of the elements is: " + sum);
		System.out.println("The average is: " + (sum / 30.0));

	}

}
