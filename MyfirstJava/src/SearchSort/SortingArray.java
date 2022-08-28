package SearchSort;

import java.util.Arrays;

public class SortingArray {
   public static void main(String args[]) throws Exception {
      int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
      Arrays.sort(array);
      printArray("Sorted array", array);
      int index = Arrays.binarySearch(array, 2);
      System.out.println("Found 2 @ " + index);
   }
   private static void printArray(String message, int array[]) {
      System.out.println(message + ": [length: " + array.length + "]");
      
      for (int i = 0; i < array.length; i++) {
         if(i != 0) {
            System.out.print(", ");
         }
         System.out.print(array[i]);                     
      }
      System.out.println();
   }
}
