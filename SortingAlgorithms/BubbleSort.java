import java.util.Arrays;


public class BubbleSort {

	static void bubbleSort(int[] arr){
		
		for (int idx = 0; idx < arr.length; idx++) {
			boolean flag = false;
			for (int idx1 = 0; idx1 < arr.length - idx - 1; idx1++) {
				if(arr[idx1] > arr[idx1 + 1]){
					int temp = arr[idx1];
					arr[idx1] = arr[idx1 + 1];
					arr[idx1 + 1] = temp;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		

		int[] arr = {1,3,2,8,1,3,13,7,21,6};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
