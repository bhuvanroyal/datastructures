package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GraphDFS {
	
	public static void dfs(int start,Map<Integer,List<Integer>> hm,List<Integer> path,Set<Integer> visited) {
		
		visited.add(start);
		path.add(start);
		for(int i: hm.get(start)) {
			if(!visited.contains(i)) {
				dfs(i,hm,path,visited);
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<Integer,List<Integer>> hm=new HashMap<>();
		int edges=Integer.parseInt(sc.nextLine());
		for(int i=0;i<edges;i++) {
			String e=sc.nextLine();
			int key=Integer.valueOf(e.split(" ")[0]);
			int value=Integer.valueOf(e.split(" ")[1]);
			if(!hm.containsKey(key)) {
				List<Integer> list=new ArrayList<>();
				list.add(value);
				hm.put(key, list);
			}
			else {
				hm.get(key).add(value);
			}
			if(!hm.containsKey(value)) {
				List<Integer> list=new ArrayList<>();
				list.add(key);
				hm.put(value, list);
			}else {
				hm.get(value).add(key);
			}
			
		}
		
		System.out.println(hm);
		Set<Integer> visited=new HashSet<>();
		List<Integer> path=new ArrayList<>();
		int start=Integer.parseInt(sc.nextLine());
		dfs(start,hm,path,visited);
		
		System.out.println(path);

	}

}
