
public class Task14 {

	static int fact(int n){
		
		int factorial = 1;
		for (int count = 1; count <= n; count++) {
			factorial *= count;
		}
		
		return factorial;
	}
	public static void main(String[] args) {
		
		System.out.println(fact(5));
		
	}

}
