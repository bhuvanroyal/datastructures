package recursion;

public class OneToN {
	
	public static void function(int n) {
		
		if(n==0) {
			return;
		}
		function(n-1);
		System.out.print(n +" ");
	}

	public static void main(StringPermutation[] args) {
		
		System.out.println(132/10);

	}

}
