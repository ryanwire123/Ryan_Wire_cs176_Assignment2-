import java.util.Scanner;
import java.util.ArrayList;
public class question2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> values = new ArrayList<>();
		System.out.println("Input values for array then press 'Q' to start the program!");
		while(in.hasNextInt()) {
			values.add(in.nextInt());
		}
		//Printing even numbers in ArrayList
		System.out.println("The even numbers are:");
		for(double evens : values) {
			if (evens % 2 == 0) {
				System.out.println(evens);
			}
		}
		//Printing odd number in ArrayList	
		System.out.println("The odd values are:");
		for(int i = 0; i < values.size(); i++) {
			if(!(values.get(i) % 2 == 0)) {
				System.out.println(values.get(i) + "  ");
			}
		 }
		//Printing elements in reverse order
		System.out.println("The elements in reverse order:");
		 for (int i = values.size()-1; i >= 0; i--) { 
			System.out.println(values.get(i) + " ");  
	     } 
		//Printing only the first, middle, and last element
		 System.out.println("The first element is " + values.get(0) + " " + "The middle element is " + values.get(values.size()/2) + " " + "The last element is " + values.get(values.size()-1));
		 //Finding and printing the largest and the smallest value
		 double largest = values.get(0);
		 double smallest = values.get(0);
		 for (int i = 1; i < values.size(); i++) {
			if(values.get(i) > largest) {
				largest = values.get(i);
			}
		}
		 for (int i = 1; i < values.size(); i++) {
			if(values.get(i) < smallest) {
				smallest = values.get(i);					
			}
		}
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The largest number is: " + largest);
		
		//Finding and printing the alternating sum of all elements
		double altSum = values.get(0);
		for (int i = 1; i < values.size(); i++) {
			if(values.get(i) % 2 == 0) {
				altSum = altSum - values.get(i);
			}else if(!(values.get(i) % 2 == 0)) {
				altSum = altSum + values.get(i);
			}
			
		}
		System.out.println(altSum);
		
		

	}

}
