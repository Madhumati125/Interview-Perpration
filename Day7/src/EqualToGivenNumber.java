// Java implementation of the approach
import java.util.*;

public class EqualToGivenNumber {

	// Function to return the maximum
	// possible pairs of gloves
	static int cntgloves(int arr[], int n)
	{
		
		// Sort the original array
		Arrays.sort(arr);
		int res = 0;
		int i = 0;

		while (i < n) {
			
			// take first number
			int number = arr[i];
			int count = 1;
			i++;

			// Count all duplicates
			while (i < n && arr[i] == number) {
				count++;
				i++;
			}
			
			// If we spotted number just 2
			// times, increment
			// result
			if (count >= 2) {
				res = res + count / 2;
			}
		}
		return res;
	}

	// Driver code
	public static void main(String[] args)
	{

		int arr[] = {6, 5, 2, 3, 5, 2, 2, 1};
		int n = arr.length;

		// Function call
		System.out.println(cntgloves(arr, n));
	}
}