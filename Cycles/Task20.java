public class Task20 {

	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {
			for (int j = i + 1; j <= 10 + i; j++) {
				if (j > 9) {
					System.out.print((j % 10) + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
