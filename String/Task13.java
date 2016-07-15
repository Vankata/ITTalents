
public class Task13 {

	static int[] newArray(int[] fArray, int[] sArray){
		
		int[] newArr = new int[fArray.length + sArray.length];
		for (int idx = 0; idx < fArray.length; idx++) {
			newArr[idx] = fArray[idx];
		}
		int tempIdx = fArray.length;
		for (int idx = 0; idx < sArray.length; idx++) {
			newArr[tempIdx] = sArray[idx];
			tempIdx++;
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5};
		int[] arr1 = {2,4,6,7};
		
		int[] arr2 = newArray(arr, arr1);
		
		for (int idx = 0; idx < arr2.length; idx++) {
			System.out.print(arr2[idx] + " ");
		}
		
	}

}
