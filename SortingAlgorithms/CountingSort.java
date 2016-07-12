
public class CountingSort {

	static void countingSort(int[] arr) {

		int maxElem = arr[0];
		int minElem = arr[0];

		for (int idx = 1; idx < arr.length; idx++) {
			if (maxElem < arr[idx]) {
				maxElem = arr[idx];
			}
			if (minElem > arr[idx]) {
				minElem = arr[idx];
			}
		}
		
		int absMin = Math.abs(minElem);	

		int[] countArr = new int[absMin + maxElem + 1];
		
		for (int idx = 0; idx < arr.length; idx++) {
			int value = arr[idx] + absMin;
			countArr[value]++;
		}
		
		for (int value = 0; value < countArr.length; value++) {
			int countThisValue = countArr[value];
			
			while(countThisValue > 0){
				System.out.print(value - absMin + " ");
				countThisValue--;
			}
		}
		
		/*int[] newArr = new int[arr.length];
		
		for (int idx = 0; idx < arr.length; idx++) {
			countArr[arr[idx]]--;
			newArr[countArr[arr[idx]]] = arr[idx];
		}
		
		return newArr;*/
		}

	public static void main(String[] args) {

		int[] arr = { 1, -3, 2, 8, 1, 3, -13, 7, 21, 6 };
		countingSort(arr);

	}

}
