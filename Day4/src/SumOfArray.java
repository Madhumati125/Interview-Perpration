import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		System.out.println("Enter The Required Size Of The Array : : ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int myArray[] = new int [size];
		int sum = 0;
		System.out.println("Enter The Elements Of The Array One By One ");
		
		for(int i=0; i<size; i++) {
			myArray[i] = s.nextInt();
			sum = sum + myArray[i];
		}
		System.out.println("Elements Of The Array Are: "+Arrays.toString(myArray));
		System.out.println("Sum Of The Elements Of The Array : : "+sum);
	}
}