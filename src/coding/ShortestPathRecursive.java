package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ShortestPathRecursive {
    private static long shortestDistance = Long.MAX_VALUE;
    private static List<Long> shortestPath = new ArrayList<>();

    public static Map<Long, Long> getNeighbors(long vertex,Map<Long, Map<Long, Long>> hm) {
        return hm.getOrDefault(vertex, new HashMap<>());
    }
    public static void findShortestPath(Map<Long, Map<Long, Long>> hm, long start, long target, List<Long> currentPath, long currentDistance) {
        currentPath.add(start);

        if (start == target) {
        	
            if (currentDistance < shortestDistance) {
                shortestDistance = currentDistance;
                shortestPath = new ArrayList<>(currentPath);
            }
        } else {
            for (Map.Entry<Long, Long> neighborEntry : getNeighbors(start,hm).entrySet()) {
                long neighbor = neighborEntry.getKey();
                long weight = neighborEntry.getValue();
                if (!currentPath.contains(neighbor)) {
                    findShortestPath(hm, neighbor, target, currentPath, currentDistance + weight);
                }
            }
        }

        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	Map<Long, Map<Long, Long>> hm = new HashMap<>();
		long N=Long.parseLong(sc.nextLine());
		for(long i=0;i<N;i++) {
			long member=Long.parseLong(sc.nextLine());
			hm.put(member, new HashMap<>());
		}
		long edges=Long.parseLong(sc.nextLine());
		for(long i=0;i<edges;i++) {
			String e=sc.nextLine();
			long key=Long.parseLong(e.split(" ")[0]);
			long value=Long.parseLong(e.split(" ")[1]);
			long time=Long.parseLong(e.split(" ")[2]);
			hm.get(key).put(value, time);
			}
		
    	long start=Long.parseLong(sc.nextLine());
    	long target=Long.parseLong(sc.nextLine());
    	
        findShortestPath(hm,start,target,new ArrayList<>(),0);

        if(shortestDistance!=Long.MAX_VALUE) {
        	System.out.println(shortestDistance);
        }
        else {
        	System.out.println("No path");
        }
    }
}
