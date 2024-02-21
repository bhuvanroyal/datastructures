package matrix;
import java.util.*;
public class NumberOfIslands {
	
	
	public static void findIslands(int row,int col,String[][] grid,String [][]vis) {
		int m=grid.length;
		int n=grid[0].length;
		List<Integer> list=new ArrayList<>();
		Queue<List<Integer>> queue=new LinkedList<>();
		Set<List<Integer>> visited=new HashSet<>();
		list.add(row);
		list.add(col);
		vis[row][col]="1";
		visited.add(list);
		queue.add(list);
		while(!queue.isEmpty()) {
//			System.out.println(queue);
			List<Integer> temp=queue.remove();
			int r=temp.get(0);
			int c=temp.get(1);
			for(int i=-1;i<=1;i++) {
				for(int j=-1;j<=1;j++) {
					if(i!=j && Math.abs(i)!=Math.abs(j)) {
						Integer ro=r+i;
						Integer co=c+j;
						if(ro>-1 && co>-1 && ro<m && co<n) {
							List<Integer> l=new ArrayList<>();
							l.add(ro);
							l.add(co);	
							if(grid[ro][co].equals("1") && !visited.contains(l)) {
								queue.add(l);
								visited.add(l);
								vis[ro][co]="1";
							}
						}
						
					}
				}
			}
		}
//		printvist(vis);
		
	}
	
	public static void printvist(String[][] vis) {
		for(int i=0;i<vis.length;i++) {
			for(int j=0;j<vis[0].length;j++) {
				System.out.print(vis[i][j] +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		String[][] arr={{"1","1","0","0","0"},{"1","1","0","0","0"},{"0","0","1","0","0"},{"0","0","0","1","1"}};
		
		int m=arr.length;
		int n=arr[0].length;
		String[][] vis=new String[m][n];
		int count=0;
		
		
		
		
		
//		findIslands(0,0,arr,vis);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(vis[i][j]!="1" && arr[i][j]=="1") {
					findIslands(i,j,arr,vis);
					count+=1;
				}
			}
		}
		System.out.println(count);
		
	}
	

}
