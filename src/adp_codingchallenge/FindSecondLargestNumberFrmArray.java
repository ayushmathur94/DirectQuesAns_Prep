package adp_codingchallenge;

import java.util.Arrays;

/**@author ayush
 *  Find Second largest number in an array 
   Given an array of integers, find second largest number in an array.
    
   Example 1:
   
   Case 1.
   
   Input :
   arr[] = {-1, 7, 1, 34, 18}
 second highest number is 18 
 Approach 1 (when no number is repeated) : sort the array and pick the number at n-2 index.
 This approach does not work if the element of an array is repeated. 
  
   Output :
   18
   
   Example 2:
   
   Input :
   {1,1,1}
   
   Output :
   Second largest doesnot exist.
 
 */







public class FindSecondLargestNumberFrmArray {

	
	
	private static void sortAndPick2ndHighest() {
	   int arr[] = {-1, 7, 1, 34, 18};
	//	int arr[] = {-1};
		int n = arr.length;
		
		if(n<2) {
			System.out.println("Second largest element does not exist !! Array TOO SMALL");
			return;
		}
		
		Arrays.sort(arr);
		System.out.println("length of array is :" + n);
		System.out.println("Second highest number when arr has all unique elements is : " + arr[n-2] );
		
	}
	
	
	private static void bestApproachPick2ndHighest() {
		int numberz[] = {-1, 7, 1, 1, 34, 18};
	
		if(numberz.length<2) {
	     System.out.println("Second largest element does not exist !!  Array TOO SMALL");		
		return;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i= 0; i < numberz.length ; i++) {
			if(numberz[i] > largest) {
				secondLargest = largest;
				largest = numberz[i];
			}
			
			// if arr[i] is between largest and second largest , we can update second largest as:
			 if(numberz[i] != largest && numberz[i] > secondLargest) {
				 secondLargest = numberz[i];
			 }
			 
			 
		
		
			
		}
		if(secondLargest == Integer.MAX_VALUE) {	 
			 System.out.println("Second largest element does not exist");
			 }else {
				 System.out.println("Second largest element is with best approach is : " + secondLargest);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		sortAndPick2ndHighest();
		
		bestApproachPick2ndHighest();
		
	}
}
