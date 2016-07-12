public class Task23 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1 + count; j < 10; j++) {
				System.out.print(i + "*" + j + ";");
			}
			count++;
			System.out.println();
		}
	}
}
