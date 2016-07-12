public class Task12 {

	public static void main(String[] args) {

		for (int i = 100; i < 1000; i++) {
			int firstDig = i / 100;
			int secDig = (i / 10) % 10;
			int thirdDig = i % 10;

			if ((firstDig != secDig) && (firstDig != thirdDig)
					&& (secDig != thirdDig)) {
				System.out.print(i + " ");
			}
		}
	}

}
