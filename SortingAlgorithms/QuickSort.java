import java.util.Arrays;


public class QuickSort {

	static void swap(int[] arr, int idx1, int idx2){
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	static int partition(int[] arr, int left, int right){
		
		
		int randomIndex = (int)(Math.random() * (right - left + 1)) + left;
		
		swap(arr, right, randomIndex);
		
		int pivot = arr[right];
		int k = left - 1;
		
		for(int index = left; index <= right; index++){
			
			if(arr[index] <= pivot){
				
				k++;
				
				swap(arr, k, index);
			}
		}
		
		return k;	
	}
	
	static void quickSort(int[] arr, int left, int right){
		
		if(left >= right){
			return;
		}
		
		
		int k = partition(arr, left, right);
		quickSort(arr, left, k - 1);
		quickSort(arr, k + 1, right);
	}
	
	public static void main(String[] args) {
		

		/*int[] arr = {1,5,3,6,64,7,6,35,7,4,4,7,74,3,56,8,5,22,5,98,4,32,2};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));*/
		
		long start = System.currentTimeMillis();
		int[] arr = new int[10_000_000];
		for (int i = 0; i < 10_000_000; i++) {
			arr[i] = i;/*(int)(Math.random() * 1_000_000);*/
		}
		quickSort(arr, 0, arr.length - 1);
		System.out.println("time qSort: " + (System.currentTimeMillis() - start));

	}

}
