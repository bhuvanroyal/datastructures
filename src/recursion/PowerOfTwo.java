package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class PowerOfTwo {
	
	public static List<Integer> find(Map<Integer,List<Integer>> hm, Integer e){
		return hm.getOrDefault(e, new ArrayList<>());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number=25;
//		double root = Math.sqrt(number);
//		System.out.println(root);
//		System.out.println(Math.abs(root - Math.floor(root))< 1e-10);

		
		Map<Integer,List<Integer>> hm= new HashMap<>();
		List<Integer> list=new ArrayList<>();
		
		for(Integer i:hm.keySet()) {
			
		}
		hm.key
		list.add(10);
		list.add(20);
		list.add(30);
		hm.put(1,list);

		System.out.println(find(hm,2).contains(20));
		
//		
//		int[] arr=new int[3];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]++;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	}

}
