package main;
import java.util.*; 

public class SortInt {
	public static String sort_int(String str) {
		//conversion to integers
		int arr[] = new int[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}

		//easier way to sort
		Arrays.sort(arr);

		String sorted = new String(Arrays.toString(arr));
		return sorted;
	}
}
