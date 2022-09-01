package searchandsort;

public class LinearSearch {
	   public static void main(String[] args) {
		   //memory allocation
		   //value fetch=??
		   //brute force approach
		   //remove the other member:what if any other member becomes target?
	      int[] a = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 ,0};
	      //{0,1,2,4} :-1,5:eligibility
	      //a is arranged from highest to smallest/reverse
	      //-2,-3,-7,-9,0,2,5....
	      int target = 0;//search criterion
	      
	      for (int i = 0; i < a.length; i++) {
	         if (a[i] == target) {
	            System.out.println("Element found at index " + i);
	            break;
	         } 
	      } 
	   }
	}