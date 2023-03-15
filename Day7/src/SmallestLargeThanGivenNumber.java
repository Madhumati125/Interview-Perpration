// Java implementation of the approach
import java.util.*;

public class SmallestLargeThanGivenNumber
{

// Function to return the smallest element greater
// than x which is not present in a[]
static int Next_greater(int a[], int n, int x)
{

	// Sort the array
	Arrays.sort(a);

	int low = 0, high = n - 1, ans = x + 1;

	// Continue until low is less
	// than or equals to high
	while (low <= high)
	{

		// Find mid
		int mid = (low + high) / 2;

		// If element at mid is less than
		// or equals to searching element
		if (a[mid] <= ans)
		{

			// If mid is equals
			// to searching element
			if (a[mid] == ans)
			{

				// Increment searching element
				ans++;

				// Make high as N - 1
				high = n - 1;
			}

			// Make low as mid + 1
			low = mid + 1;
		}

		// Make high as mid - 1
		else
			high = mid - 1;
	}

	// Return the next greater element
	return ans;
}

// Driver code
public static void main(String[] args)
{
	int a[] = { 1, 5, 10, 4, 7 }, x = 4;
	int n = a.length;

	System.out.println(Next_greater(a, n, x));
}
}