public class GreaterOrSmaller {
   public static void main(String args[]) {
      int value = 65;
      int[] myArray = {41, 52, 63, 74, 85, 96 };
      System.out.println("Elements of the array that are equal to the given value are::");
      for(int i=0; i<myArray.length; i++) {
         if(value==myArray[i]) {
            System.out.println("Index ::"+i+" Element::"+myArray[i]);
         }
      }
      System.out.println("Elements of the array that are greater than the given value are::");
      for(int i=0; i<myArray.length; i++) {
         if(value<=myArray[i]) {
            System.out.println("Index ::"+i+" Element::"+myArray[i]);
         }
      }
      System.out.println("Elements of the array that are less than the given value are::");
      for(int i=0; i<myArray.length; i++) {
         if(value>myArray[i]) {
            System.out.println("Index ::"+i+" Element::"+myArray[i]);
         }
      }
   }
}