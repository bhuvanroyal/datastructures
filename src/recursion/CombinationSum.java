package recursion;
import java.util.*;
public class CombinationSum {
	public static void combsum(int ind,int[] arr, List<List<Integer>> combinations, List<Integer> c,int target) {
		
		if(ind==arr.length) {
			if(target==0) {
			combinations.add(new ArrayList<>(c));
			}
			return;
		}
		if(arr[ind]<=target) {
			c.add(arr[ind]);
			combsum(ind,arr,combinations,c,target-arr[ind]);
			c.remove(c.size()-1);
		}
		
		combsum(ind+1,arr,combinations,c,target);
	}

	public static void main(StringPermutation[] args) {
		
		int[] arr= {2,3,6,1,7};
		int target=7;
		List<List<Integer>> combinations=new ArrayList<>();
		List<Integer> c=new ArrayList<>();
		combsum(0,arr,combinations,c,target);
		System.out.println(combinations);
		

	}

}
