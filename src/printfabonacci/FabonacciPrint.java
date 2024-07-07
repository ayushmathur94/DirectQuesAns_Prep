package printfabonacci;

public class FabonacciPrint {
/*	 Recursion (recursive approach) */
	static int n1=1, n2=1, n3=0;
	static void printFabonacci(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" " + n3);
			printFabonacci(count-1);
		}
	}
	
	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1 + " " + n2);
		printFabonacci(count-2);
	}

	
/*	Iteration (Iterative approach) */
	
/*	public static void main(String[] args){
	int count=7, num1=0, num2=1;
	System.out.print("Fibonacci Series of "+ count+" numbers : ");
	for(int i=1; i<=count ; ++i) {
		System.out.print(num1+" ");
		int sumOfPrevTwo = num1 + num2;
		num1 = num2;
		num2 = sumOfPrevTwo;
	}
	
	}*/
	
	
}
