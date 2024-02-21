package problems;

public class CreateRectangle {

	public static void main(String[] args) {
		
		int N=1;
		int M=4;
		int K=7;
		
		int S=N*M;
		if(S>=K && (K%N==0 || K%M==0)){
			System.out.println(0);
		}
		else if(S>=K) {
			int dif=Integer.MAX_VALUE;
			int i,j;
			if(N<=M) {
				i=N;
				j=M;
			}
			else {
				i=M;
				j=N;
			}
			while(i>1) {
				
				if(dif>Math.abs(i*j - K)){
					dif=Math.abs(i*j - K);
				}
				else if(dif<Math.abs(i*j - K)) {
					break;
				}
				i-=1;
			}
			System.out.println(Integer.valueOf((int) Math.pow(dif, 2)));
		}
		else if(S<K) {
			System.out.println(Integer.valueOf((int) Math.pow(S-K, 2)));
		}

	}

}
