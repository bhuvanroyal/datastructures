package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class graphStructure {

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
// BFS traversing the undirected graph
		int a=Integer.parseInt(sc.nextLine());
		Queue<Integer> queue=new LinkedList<>();
		Set<Integer> visited=new HashSet<>();
		queue.add(a);
		visited.add(a);
		while(!queue.isEmpty()){
			int current=queue.remove();
			System.out.println(current);
			for(int i:hm.get(current)) {
				if(!visited.contains(i)) {
					visited.add(i);
					queue.add(i);
				}
			}	
			System.out.println(queue);
			System.out.println(visited);
		}
		System.out.println();

	}

}
