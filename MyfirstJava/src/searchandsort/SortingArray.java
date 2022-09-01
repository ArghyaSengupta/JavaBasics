package searchandsort;

import java.util.Arrays;

public class SortingArray {
   public static void main(String args[]) throws Exception {
      int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
      Arrays.sort(array);//aranging
      printArray("Sorted array", array);//passing 2 args
      int index = Arrays.binarySearch(array, 2);//internal checks
      System.out.println("Found 2 @ " + index);
   }
   //acknowledge 2 args: 1st arg is a string, 2nd arg is a arrray
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
