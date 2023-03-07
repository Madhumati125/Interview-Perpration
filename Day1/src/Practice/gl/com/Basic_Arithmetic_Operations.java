package Practice.gl.com;

import java.util.Scanner;

public class Basic_Arithmetic_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int num_1 = sc.nextInt();
		System.out.println("Please enter number 2: ");
		int num_2 = sc.nextInt();
		
		//Sum of two numbers
		int sum = num_1+num_2;
		System.out.println("Sum of 2 Numbers: " + sum);
		
		//Subtracts  of 2 numbers
		int sub = num_1-num_2;
		System.out.println("Sub: " + sub );
		
		int mul = num_1* num_2;
		System.out.println("Multiply of 2 numbers: "+ mul);
		
		int rem = num_1 % num_2;
		System.out.println( "Remainder of dividing: " + rem);
		
		double div = (double) num_1 / num_2;
		System.out.println("Division:"+ div);
		
		sc.close();
	}

}