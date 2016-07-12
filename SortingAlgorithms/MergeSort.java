import java.util.Arrays;

public class MergeSort {

	static int[] mergeSort(int[] arr) {
		if (arr.length > 1) {

			int arr1Elements = arr.length / 2;
			int arr2Elements = arr.length - arr1Elements;

			int[] arr1 = new int[arr1Elements];
			int[] arr2 = new int[arr2Elements];

			for (int idx = 0; idx < arr1Elements; idx++) {
				arr1[idx] = arr[idx];
			}

			for (int idx = arr1Elements; idx < arr1Elements + arr2Elements; idx++) {
				arr2[idx - arr1Elements] = arr[idx];
			}

			mergeSort(arr1);
			mergeSort(arr2);

			int value = 0;
			int index = 0;
			int variable = 0;

			while (index < arr1.length && variable < arr2.length) {

				if (arr1[index] < arr2[variable]) {
					arr[value] = arr1[index];
					index++;
				} else {
					arr[value] = arr2[variable];
					variable++;
				}

				value++;
			}

			while (index < arr1.length) {
				arr[value] = arr1[index];
				value++;
				index++;
			}

			while (variable < arr2.length) {
				arr[value] = arr2[variable];
				value++;
				variable++;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		int[] arr = new int[10_000_000];
		for (int i = 0; i < 10_000_000; i++) {
			arr[i] = i;/*(int)(Math.random() * 1_000_000);*/
		}
		mergeSort(arr);
		System.out.println("time mSort: " + (System.currentTimeMillis() - start));
		
		
		//System.out.println(Arrays.toString(arr));

	

	}

}
