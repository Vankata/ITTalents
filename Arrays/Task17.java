import java.util.Scanner;


public class Task17 {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.print("Enter the elements of the array: ");
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = sc.nextInt();
		}
		
		boolean flag = true;
		for (int idx = 0; idx < array.length - 2; idx+=2) {
			if((array[idx] >= array[idx + 1]) || (array[idx + 1] <= array[idx + 2])){
				flag = false;
			}
		}
		
		if(flag){
			System.out.println("The numbers are ordered in the rigth way! ");
		}else{
			System.out.println("the numbers are not ordered in the rigth way! ");
		}
	}

}
