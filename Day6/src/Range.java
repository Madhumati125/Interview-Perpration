// Java code for the following approach

import java.util.*;

public class Range {

	// function that check all elements between A and B
	// including them are present in set or not
	public static boolean checkElements(int arr[], int n, int A, int B) {
		Set<Integer> st = new HashSet<Integer>();

		// put all the elements of array into set
		for (int i = 0; i < n; i++) {
			st.add(arr[i]);
		}

		// now check every between between A to B including
		// them also, that they are present in set or not
		for (int i = A; i <= B; i++) {
			// element not present in set so return false
			// and no need to traverse further
			if (!st.contains(i)) {
				return false;
			}
		}

		// all elements between A and B including them are
		// present in set so return true
		return true;
	}

	// Driver code
	public static void main(String[] args) {
		// Defining Array and size
		int arr[] = { 1, 4, 5, 2, 7, 8, 3 };
		int n = arr.length;
		// A is lower limit and B is the upper limit
		// of range
		int A = 2, B = 5;
		// True denotes all elements were present
		if (checkElements(arr, n, A, B))
			System.out.println("Yes");
		// False denotes any element was not present
		else
			System.out.println("No");
	}
}