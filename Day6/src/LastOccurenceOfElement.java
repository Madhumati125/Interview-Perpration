import java.util.ArrayList;

public class LastOccurenceOfElement {
		public static void main(String[] args) {
			
			ArrayList<String> languages = new ArrayList<>();
			
			
			languages.add("JavaScript");
			languages.add("Python");
			languages.add("Java");
			languages.add("C++");
			languages.add("Java");
			System.out.println("Programming Languages: " + languages);
			
			
			int position1 = languages.lastIndexOf("Java");
			System.out.println("Last Occurence Of Java: " + position1);
			
			
			
			int position2 = languages.lastIndexOf("C");
			System.out.println("Last Occurence Of C: " + position2);
		}
}