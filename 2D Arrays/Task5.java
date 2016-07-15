
public class Task5 {
	
	public static void main(String[] args) {
	
		int[][] matrix = { { 5, 8, 5, 0 }, { 1, 3, 5, 7 }, { 1, 2, 4, 4 },
				{ 5, 8, 5, 0 } };
		
		int sumRow = 0;
		int sumCol = 0;
		int tempRow = 0;
		int tempCol = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				tempRow += matrix[row][col];
				tempCol += matrix[col][row];
			}
			if(tempRow > sumRow){
				sumRow = tempRow;
			}
			if(tempCol > sumCol){
				sumCol = tempCol;
			}
			tempRow = 0;
			tempCol = 0;
		}

		
		System.out.println("Biggest sum on rows: " + sumRow);
		System.out.println("Biggest sum on cols: " + sumCol);
		if(sumRow > sumCol){
			System.out.println("The biggest sum on rows is bigger than the biggest sum on cols! ");
		} else{
			if(sumRow == sumCol){
				System.out.println("Both biggest sums are equal! ");
			}else{
				if(sumRow < sumCol){
					System.out.println("The biggest sum on cols is bigger that the biggest sum on rows! ");
				}
			}
		}
	}

}
