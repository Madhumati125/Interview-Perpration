public class ArrayEqual 
{
	public static void main(String[] args) 
	{
		
		int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		
		
		if(a1 == a2) {
			System.out.println("Arrays Are Equal.");
		}
		else {
			System.out.println("Arrays Are Not Equal.");
		}
	}
}