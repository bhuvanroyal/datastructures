package problems;

import java.util.Arrays;

public class Lexicographical {

	public static void main(String[] args) {
		
		int[] arr= {1,2};
		int B=2;
		int i=0;
		while(B>0 && i<arr.length) {
			int max=arr[i];
			int j,ind=0;
			for(j=i+1;j<arr.length;j++) {
				if(max<arr[j]) {
					max=arr[j];
					ind=j;
				}
			}
			if(max!=arr[i]) {
				int temp=arr[i];
				arr[i]=max;
				arr[ind]=temp;
				B-=1;
			}
			else {
				i+=1;
			}
		}
		
		for(int n=0;n<arr.length;n++) {
			System.out.print(arr[n] +",");
		}
		

	}

}
