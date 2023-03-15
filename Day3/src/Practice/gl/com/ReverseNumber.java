package Practice.gl.com;

import java.util.Scanner;

public class ReverseNumber {

	public static void reverseNumber(int number)
	{
		if (number < 10)
		{
			System.out.println(number);
			return;
		}
		else
		{
			System.out.print(number % 10);
			reverseNumber(number/10);
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter The Number That You Want To Reverse: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("The Reverse Of The Given Number Is: ");
		reverseNumber(num);
		sc.close();
	}
}