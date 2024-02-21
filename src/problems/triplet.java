package problems;

import java.util.*;

public class triplet {
	
	public static void tripletrecursive(int ind,int[] nums,int count,List<Integer> res) {
		
		if(res.get(res.size()-1)<nums[ind]) {
			res.add(nums[ind]);
			tripletrecursive(ind+1,nums,count+1,res);
		}
		
		tripletrecursive(ind+1,nums,count,res);
		
		
	}

	public static void main(String[] args) {

//		int[] arr= {1,5,0,4,1,3};
//		int count=0;
//		List<Integer> res=new ArrayList<>();
//		for(int i=0;i<arr.length;i++) {
//		res.add(arr[i]);
//		tripletrecursive(i,arr,count,res);
//		}
		int i=3;
		int pow=(int)(Math.pow(i,2));
		System.out.println(12%4);
	}

}
