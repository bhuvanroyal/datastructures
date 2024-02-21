package wissenTechnologies;

import java.util.*;

public class VirtualMachines {
	
	public static void machines(int[]arr, List<Integer> res, Set<Integer> visited,int[] vm,List<List<Integer>> paths) {
		
			if(res.size()==arr.length) {
				paths.add(new ArrayList<>(res));
				return;
			}
			for(int i=0;i<arr.length;i++) {
				
				if(!visited.contains(i)&& (vm[res.size()]%arr[i]==0 || arr[i]%vm[res.size()]==0)) {
					res.add(arr[i]);
					visited.add(i);
					machines(arr,res,visited,vm,paths);
					res.remove(res.size()-1);
					visited.remove(i);
				}
				
			}	
	}

	public static void main(String[] args) {
		
		int N=5;
		int[] key= {12,14,6,1,5};
		int[] vm=new int[N];
		for(int i=0;i<N;i++) {
			vm[i]=i+1;
		}
		
		List<Integer> res=new ArrayList<>();
		List<List<Integer>>paths=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		machines(key,res,set,vm,paths);
		System.out.println(paths.size());

	}

}
