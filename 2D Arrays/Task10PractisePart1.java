import java.util.Scanner;


public class Task10PractisePart1 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.print("Enter the elements of the array: ");
		for (int idx = 0; idx < size; idx++) {
			array[idx] = sc.nextInt();
		}
		
		int tempCount = 0;
		int count = 0;
		int elem = 0;
		for (int idx = 0; idx < array.length; idx++) {
			for (int idx1 = 0; idx1 < array.length; idx1++) {
				if(array[idx1] == array[idx]){
					count++;
				}
			}
			if(count > tempCount){
				tempCount = count;
				elem = array[idx];
			}
			count = 0;
		}
		
		System.out.println("The most common element in the array is: " + elem + "\nYou can find it " + tempCount  + " times in the array! ");

	}

}