package Practice.gl.com;

public class RightDownMirrorStarPattern {

	public static void main(String[] args) {
		int numberOfRows=8;
		for (int i=numberOfRows; i>=1; i--)
		{
			for (int j=numberOfRows; j>i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}