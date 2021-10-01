import java.util.Arrays;
public class question1 {

	public static void main(String[] args) {
		//declaring 2d array
		int[][] values = new int[4][4];
		//filling elements of the array
		for (int i = 0; i < values.length; i++) {
			for(int j = 0; j < values[0].length; j++ ) {
				values[i][j] = i + j;
			}
		}
		//compute the sum of the second row
		int total = 0;
		for(int i = 0;  i< values[0].length; i++) {
			total = total + values[2][i];
	}
		System.out.println("The sum of the second row is");
		System.out.println(total);
		
		//compute the sum of the third column
		int columnTotal = 0;
		for(int i = 0; i < values.length; i++) {
			columnTotal = columnTotal + values[i][3];
	}
		System.out.println("The sum of the third column is:");
		System.out.println(columnTotal);
		
		int sum = 0; 
		for (int i = 0; i < values.length; i++) {
			for(int j = 0; j < values[0].length; j++ ) {
				sum = sum + values[i][j];	
			}
		}
		System.out.println("The sum of all elements is:");
		System.out.println(sum);
		//System.out.print(" ");
		System.out.println(Arrays.deepToString(values).replace("], ", "]\n"));

	}

}

	
