package coding;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class NaggingReact {
	
	public static List<Long> getNeighbors(long vertex,Map<Long, List<Long>> hm) {
        return hm.getOrDefault(vertex, new ArrayList<>());
    }
	
	public static void graphIterate(Map<Long, List<Long>> hm, long start, long target, List<Long> path, Set<Long> neigh) {
		path.add(start);
		if(start==target) {
			if(path.size()==2) {
				neigh.add(path.get(0));
			}
			else {
				neigh.add(path.get(1));
			}
		}
		for(long i:getNeighbors(start,hm)) {
			
			if(!path.contains(i)) {
				graphIterate(hm,i,target,path,neigh);
				
			}
		}
		path.remove(path.size()-1);
		
		
	}

	public static void main(String[] args) {
		
		 Map<Long, List<Long>> hm = new HashMap<>();
		 Scanner sc=new Scanner(System.in);
		 long N=Long.parseLong(sc.nextLine());
		 for(long i=0;i<N;i++){
				long member=Long.parseLong(sc.nextLine());
				hm.put(member, new ArrayList<>());
		 }
		 long e=Long.parseLong(sc.nextLine());
		 for(long i=0;i<e;i++) {
			 String in=sc.nextLine();
			 long k=Long.parseLong(in.split(" ")[0]);
			 long v=Long.parseLong(in.split(" ")[1]);
			 hm.get(k).add(v);
		 }
		 long A=Long.parseLong(sc.nextLine());
		 long B=Long.parseLong(sc.nextLine());
		 Set<Long>neigh=new HashSet<>();
		 graphIterate(hm,A,B,new ArrayList<>(),neigh);
		 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
		 for(long i:neigh) {
			 System.out.print(i +" ");
		 }

	}

}
