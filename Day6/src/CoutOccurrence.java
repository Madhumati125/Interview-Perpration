import java.util.Scanner;
public class CoutOccurrence 
{
	public static void main(String[] args) 
	{
		int n, x, count = 0, i = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter No. Of Elements You Want In Array: ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter All The Elements: ");
		for(i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.print("Enter The Element Of Which You Want To Count Number Of Occurences: ");
		x = s.nextInt();
		for(i = 0; i < n; i++)
		{
			if(a[i] == x)
			{
				count++;
			}
		}
		System.out.println("Number Of Occurence Of The Element: "+count);
	}
}