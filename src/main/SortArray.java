package main;
import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		//prompt the user to enter input
		System.out.println("Enter a string of characters or integers you want sorted:");
		Scanner input = new Scanner(System.in); 

		//save user input as string
		String str = input.nextLine();
		
		//display the sorted output
		System.out.println("The sorted character array is: " + SortStr.sort_str(str));
	}
	
}
