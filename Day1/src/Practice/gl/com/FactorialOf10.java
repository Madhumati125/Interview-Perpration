package Practice.gl.com;

public class FactorialOf10 {
	public static void main(String[] args) {
		
		int n = 10;
		int fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact *= i;
			
		}
		System.out.println(fact);
	}

}