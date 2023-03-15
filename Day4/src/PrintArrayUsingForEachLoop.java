public class PrintArrayUsingForEachLoop {

	public static void main(String[] args) {
		
		String[] city = new String[4];
		
		city[0] = "Banglore";
		city[1] = "Pune";
		city[2] = "Gujarat";
		city[3] = "Mumbai";
		
		for (String str : city)
		{
			System.out.println(str);
		}
	}
}