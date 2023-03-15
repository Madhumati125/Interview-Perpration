import java.util.Arrays;

public class KthLargestElement {

	public static int KthLargestElement(int arr[], int n, int k) {
		Arrays.sort(arr);
		return arr[n - k];
	}
	
	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 6, 3, 9, 7 };
		int n = arr.length;
		int k = 2;
		int x = KthLargestElement(arr, n, k);
		System.out.print("Kth Largest Element Is " + x);
	}
}