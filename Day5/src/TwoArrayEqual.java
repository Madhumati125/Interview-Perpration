import java.util.Arrays;

public class TwoArrayEqual {

	public static void main(String[] args) {
		
		int [] arr1 = new int [] {1, 2, 3, 4};
		int [] arr2 = new int [] {1, 2, 3, 4};
		int [] arr3 = new int [] {1, 2, 4, 3};
		
		System.out.println("Is aar1 Equals To arr2 : " + Arrays.equals(arr1, arr2));
		
		System.out.println("Is aar1 Equals To arr3 : " + Arrays.equals(arr1, arr3));
	}
}
