import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the first array: ");
		int fSize = sc.nextInt();
		System.out.print("Enter the size of the second array: ");
		int sSize = sc.nextInt();

		int[] fArr = new int[fSize];
		int[] sArr = new int[sSize];
		System.out.print("Enter the elements of the first array: ");
		for (int idx = 0; idx < fArr.length; idx++) {
			fArr[idx] = sc.nextInt();
		}
		System.out.print("Enter the elements of the second array: ");
		for (int idx = 0; idx < sArr.length; idx++) {
			sArr[idx] = sc.nextInt();
		}

		boolean flag = true;
		boolean flag1 = true;
		if (fArr.length != sArr.length) {
			flag1 = false;
		} else {
			for (int idx = 0; idx < fArr.length; idx++) {
				if (fArr[idx] != sArr[idx]) {
					flag = false;
					break;
				}
			}
		}

		if (!flag1) {
			System.out
					.println("The arrays have different length and different numbers! ");
		} else {
			if (flag) {
				System.out
						.println("The arrays have the same length and the same numbers! ");
			} else {
				System.out
						.println("the arrays have the same length but not the same numbers! ");
			}
		}
	}

}
