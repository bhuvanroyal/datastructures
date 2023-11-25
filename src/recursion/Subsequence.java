package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
	
	public static void subsequence(int i,int[] arr,ArrayList<ArrayList<Integer>> lists,ArrayList<Integer> list) {
		
		if(i==arr.length) {
//			System.out.println(list);
			lists.add(new ArrayList<>(list));
			return;
			
		}
		
		list.add(arr[i]);
		subsequence(i+1,arr,lists,list);
		
		list.remove(list.size()-1);
		subsequence(i+1,arr,lists,list);
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
		int[] arr= {1,2,3,4};
		subsequence(0,arr,lists,list);
		for (ArrayList<Integer> subsequence : lists) {
	        System.out.println(subsequence);
	    }

	}

}
