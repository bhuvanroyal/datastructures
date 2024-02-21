package trees;
import java.util.*;
public class edgeRemoval {
	
	public static List<Integer> find(Map<Integer,List<Integer>> hm,int key){
		return hm.getOrDefault(key, new ArrayList<>());
	}

	
	public static boolean traverse(Map<Integer,List<Integer>> hm,int start, int neighbor,int[] values) {
		Set<Integer> visited= new HashSet<>();
		Queue<Integer> queue=new LinkedList<>();
		queue.add(start);
		visited.add(start);
		int prod=values[start];
		while(!queue.isEmpty()) {
			int temp=queue.remove();
			for(int i:find(hm,temp)) {
				if(!visited.contains(i) && i!=neighbor) {
					prod*=values[i];
					if(prod%6==0) {
						return true;
					}
					visited.add(i);
					queue.add(i);
				}
			}
		}
		System.out.println(visited);
		if(prod%6==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		int N=7;
		int[] values= {3,6,2,3,1,2,12};
		int[][] edges= {{0,2},{0,3},{2,6},{2,5},{3,1},{3,4}};
		Map<Integer,List<Integer>> hm=new HashMap<>();
		
		for(int[]edge: edges) {
			if(!hm.containsKey(edge[0])) {
				List<Integer> list=new ArrayList<>();
				list.add(edge[1]);
				hm.put(edge[0],list);
			}
			else {
				hm.get(edge[0]).add(edge[1]);
			}
			if(!hm.containsKey(edge[1])) {
				List<Integer> list=new ArrayList<>();
				list.add(edge[0]);
				hm.put(edge[1],list);
			}
			else {
				hm.get(edge[1]).add(edge[0]);
			}
		}
		System.out.println(hm);
		int count=0;
		Set<Integer> vis=new HashSet<>();
		for(int i=0;i<N;i++) {
			vis.add(i);
			for(int ind :find(hm,i)) 
			{
				if(!vis.contains(ind))
				{
				System.out.println(ind +" " +i);
				if(traverse(hm,ind,i,values) && traverse(hm,i,ind,values)) {
					count+=1;
				}
				}
			}
		}
		System.out.println(count);
		
 
	}

}
