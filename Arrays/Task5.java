public class Task5 {

	public static void main(String[] args) {

		int[] array = new int[10];

		for (int idx = 0; idx < array.length; idx++) {
			array[idx] = idx * 3;
		}

		for (int idx = 0; idx < array.length; idx++) {
			System.out.print(array[idx] + " ");
		}

	}

}
