import java.util.Arrays;


public class SelectionSort {

	static void selectionSort(int[] arr){
		
		int start = 0;
		int end = arr.length - 1;
		
		for (int idx = 0; idx < arr.length / 2; idx++) {
			int maxIndex = start;
			int minIndex = start;
			for (int idx1 = start; idx1 <= end; idx1++) {
				if(arr[idx1] > arr[maxIndex]){
					maxIndex = idx1;
				}
				if(arr[idx1] < arr[minIndex]){
					minIndex = idx1;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[end];
			arr[end] = temp;
			
			if(minIndex == end){
				minIndex = maxIndex;
			}
			
			temp = arr[minIndex];
			arr[minIndex] = arr[start];
			arr[start] = temp;
			
			end--;
			start++;
		}
	}

	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2,8,1,3,13,7,21,6};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));


		

	}

}
