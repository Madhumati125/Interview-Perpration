package Practice.gl.com;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int num, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Sum From: ");
		i = sc.nextInt();
		System.out.print("Sum Up To: ");
		num = sc.nextInt();
		while(i <= num)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("Sum Of Natural Numbers = " + sum);
		sc.close();
	}
}