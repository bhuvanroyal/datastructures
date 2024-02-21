package practice;

public class CollectCoins {

	public static void main(String[] args) {
		int N=6;
		int[][] coins= {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
		boolean[][] gold=new boolean[N+1][N+1];
		for(int[] arr:coins) {
			gold[arr[0]][arr[1]]=true;
		}
		for(int[] arr:coins) {
			if(arr[1]==1){
				
			}
			
		}
		
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				System.out.print(gold[i][j] +"|");
			}
			System.out.println();
		}

	}

}
