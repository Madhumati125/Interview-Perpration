public class ElementsInArrayLessThanGivenNumber {
   public static void main(String[] args) {

      // The array elements
      int arr[] = { 556, 10, 259, 874, 123, 453, -96, -54, -2369}, num = 0;
      System.out.println("The array elements are-");

      // Print the array elements
      for (int i : arr) {
         System.out.print(i + ", ");
      }

      // The counter two count all elements smaller than the number
      int count = 0;

      // Count all elements smaller than num
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] < num) {
            count++;
         }
      }
      System.out.println("\nThe number of array elements that are smaller than " + num + " are " + count);
   }
}