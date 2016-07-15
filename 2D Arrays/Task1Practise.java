import java.util.Scanner;

public class Task1Practise {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.print("Enter the elements of the array: ");
		int[][] array = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		boolean flag = true;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (array[i][j] < 0) {
					flag = false;
					break;
				}
			}
			if(!flag){
				break;
			}
		}

		if (flag) {
			System.out.println("All of the elements of the array are positive! ");
		} else {
			System.out.println("Not all of the elements of the array are positive! ");
		}
	}

}