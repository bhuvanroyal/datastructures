package recursion;

public class Fibonacci {
	
	public static int nthFibonacci(int n) {
		
		if(n<=1) {
			return n;
		}
		int f=nthFibonacci(n-1);
		int l=nthFibonacci(n-2);
		return f+l;
	}

	public static void main(StringPermutation[] args) {
		
		System.out.println(nthFibonacci(2));
		

	}

}
