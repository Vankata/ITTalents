import java.util.Arrays;

public class HeapSort {

	private static int N;

	public static void heapSort(int[] arr) {
		heapify(arr);

		for (int i = N; i >= 0; i--) {
			swap(arr, 0, i);

			N = N - 1;

			downHeap(arr, 0);
		}

	}

	public static void heapify(int[] arr) {
		N = arr.length - 1;

		for (int index = N / 2; index >= 0; index--) {
			downHeap(arr, index);
		}

	}

	public static void downHeap(int[] arr, int i) {
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;
		int max = i;

		if (leftChild <= N && arr[leftChild] > arr[i]) {
			max = leftChild;
		}

		if (rightChild <= N && arr[rightChild] > arr[max]) {
			max = rightChild;
		}

		if (max != i) {
			swap(arr, max, i);
			downHeap(arr, max);
		}
	}

	public static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = { 1, 5, 3, 6, 64, 7, 6, 35, 7, 4, 4, 7, 74, 3, 56, 8, 5,
//				22, 5, 98, 4, 32, 2 };
//		heapSort(arr);
//		System.out.println(Arrays.toString(arr));
		
		long start = System.currentTimeMillis();
		int[] arr = new int[10_000_000];
		for (int i = 0; i < 10_000_000; i++) {
			arr[i] = i;/*(int)(Math.random() * 1_000_000);*/
		}
		heapSort(arr);
		System.out.println("time mSort: " + (System.currentTimeMillis() - start));
	}

}
