
public class Task12 {

	static void createArray(int n){
		int[] array = new int[n];
		int count = 1;
		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = count;
			count++;
		}
		
		for (int idx = 0; idx < array.length; idx++) {
			System.out.print(array[idx] + " ");
		}
	}

	public static void main(String[] args) {
		
		createArray(52);
		

	}

}
