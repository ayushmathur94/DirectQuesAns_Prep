package adp_codingchallenge;

public class CountDistinctPalindromeStrings {

	
	private static int countPalindromeStrings(String str) {
		
		String temp = "";
		StringBuffer stf ;
		int count = 0 ;
		
		// Iterate the loop twice 
		for(int i = 0 ; i < str.length() ; i ++) {
			
			for(int j = i+1 ; j<= str.length(); j++) {
				// Get each substring 
				temp = str.substring(i,j);
				
				// If length is greater than or equal to two 
				// Check for palindrome	
				if(temp.length() >=2) {
					// Use StringBuffer class to reverse the string 
					stf = new StringBuffer(temp);
					stf.reverse();
					
					// Compare substring wih reverse of substring 
					if(stf.toString().compareTo(temp)== 0) {
						System.out.println(stf);
						count++ ;
					}
				}
				
			}
			
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		String str = "aababbcded";
		String strz = "abbaeae";
		
		System.out.println(countPalindromeStrings(strz));
	}
	
}
