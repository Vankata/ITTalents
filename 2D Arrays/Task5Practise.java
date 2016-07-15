import java.util.Scanner;


public class Task5Practise {


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
		
		int sum = 0;
		int temp = 0;
		int tempIdx = 0;
		
		for (int idx = 0; idx < rows; idx++) {
			for (int idx1 = 0; idx1 < cols; idx1++) {
				sum += matrix[idx][idx1];
			}
			if(sum > temp){
				temp = sum;
				tempIdx = idx;
			}
			sum = 0;
		}
		
		System.out.println("The row with the biggest sum is at index " + tempIdx + " and the sum is " + temp + "! ");

	}

}
