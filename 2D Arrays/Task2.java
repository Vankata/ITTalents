import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the matrix(rows = cols): ");
		int size = sc.nextInt();
		
		int matrix[][] = new int[size][size];
		System.out.print("Enter the elements of the matrix: ");
		for (int rows = 0; rows < size; rows++) {
			for (int cols = 0; cols < size; cols++) {
				matrix[rows][cols] = sc.nextInt();
			}
		}
		
		System.out.print("Elements on the main diagonal: ");
		for (int rows = 0; rows < size; rows++) {
			for (int cols = 0; cols < size; cols++) {
				if(rows == cols){
					System.out.print(matrix[rows][cols] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.print("Elements on the second diagonal: ");
		for (int rows = 0; rows < size; rows++) {
			for (int cols = 0; cols < size; cols++) {
				if(rows + cols == size - 1){
					System.out.print(matrix[rows][cols] + " ");
				}
			}
		}
	}

}
