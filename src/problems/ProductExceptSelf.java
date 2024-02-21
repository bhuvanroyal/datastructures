package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {

	public static void main(String[] args) {
		
				int[] nums= {1,2,3,4};
 		
		       Integer[] result = new Integer[nums.length];
		       
		        for(int i = 0; i < nums.length; i++)
		            result[i] = 1;

		       int fprod = 1;
		       int rprod = 1;

		       for(int i = 0, j = nums.length-1; i < nums.length; i++,j--){
		           if(i == 0)
		                continue;
		           fprod *= nums[i-1];
		           result[i] *= fprod;

		           if(j == nums.length-1)
		                continue;
		           rprod *= nums[j+1];
		           result[j] *= rprod;
		       }
		       
		      List<Integer> list=new ArrayList(Arrays.asList(result));
		      System.out.println(list);
	}

}
