import java.util.Scanner;


public class Task4 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Enter first tree names, then another three names separated with a comma: ");
		String names = new Scanner(System.in).nextLine();
		
		
		String[] namesArr = names.split(",");
		
		int temp = 0;
		int temp1 = 0;
		for (int idx = 0; idx < namesArr[0].length(); idx++) {
			if(namesArr[0].charAt(idx) != ' '){
				temp += namesArr[0].charAt(idx);
			}
		}
		
		for (int idx = 0; idx < namesArr[1].length(); idx++) {
			if(namesArr[1].charAt(idx) != ' '){
				temp1 += namesArr[1].charAt(idx);
			}
		}
		
		if(temp < temp1){
			System.out.println(namesArr[1]);
		}else{
			if(temp > temp1){
				System.out.println(namesArr[0]);
			}else{
				System.out.println(namesArr[0] + "\n" + namesArr[1]);
			}
		}
		

	}

}
