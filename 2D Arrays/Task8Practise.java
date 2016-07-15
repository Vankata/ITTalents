import java.util.Scanner;


public class Task8Practise {


	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.print("Enter the elements of the array: ");
		boolean[][] matrix = new boolean[rows][cols];
		for (int idx = 0; idx < rows; idx++) {
			for (int idx1 = 0; idx1 < cols; idx1++) {
				matrix[idx][idx1] = sc.nextBoolean();
			}
		}
		
		boolean flag = false;
		for (int idx = 0; idx < rows; idx++) {
			for (int idx1 = 0; idx1 < cols; idx1++) {
				if((idx + idx1 < rows - 1) && (matrix[idx][idx1] == true)){
					flag = true;
					break;
				}
			}
		}
		
		if(flag){
			System.out.println("There is true value above the second diagonal! ");
		}else{
			System.out.println("There is not true value above the second diagonal! ");
		}

	}

}
