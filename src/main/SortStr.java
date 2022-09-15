package main;
import java.util.*; 

public class SortStr {
	public static String sort_str(String str) {
		//convert string to character array
		char arr[] = str.toCharArray();
		char temp;

		//sort character array
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				//switch ordering if character in front is "greater" than character behind
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//convert sorted character array to string (so that it will display correctly)
		String sorted = new String(Arrays.toString(arr));
		return sorted;
	}
}