package wissenTechnologies;

public class MinimumMoves {
	
	
	public static long moves(int N, int[]arr,long count) {
		for(int i=0;i<N;i++)
		{
			int j=1;
			long el=arr[i];
			while((2<<j)<el)
			 {
				 j+=1;
			 }
			long left=Math.abs(el-(2<<j-1));
			long right=Math.abs(el-(2<<j));
		count+=Math.min(left, right);
			
		}
		return count;
	}

	public static void main(String[] args) {
		int N=6;
		int[]arr= {3,10,16,4,15,17};
		long count=0;
		System.out.println(moves(N,arr,count));
		
	}

}
