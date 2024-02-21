package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	
	public static void mergesort(int[] arr) {
		mergesort(arr,0,arr.length-1);
	}
	public static void mergesort(int[]arr,int first, int last) {
		
		if(first==last) {
			return;
		}
		int mid=(first+last)/2;
		mergesort(arr,first,mid);
		mergesort(arr,mid+1,last);
		merge(arr,first,last,mid);
		
	}
	public static void merge(int[]arr, int first, int last,int mid) {
		
		int temp=mid;
		while(first<=temp && mid+1<=last) {
			if(arr[first]>=arr[mid+1]) {
				int s=mid+1;
				while(s>first) {
					int t=arr[s-1];
					arr[s-1]=arr[s];
					arr[s]=t;
					s-=1;
				}
				first+=1;
				mid+=1;
			}
			else if(arr[first]<arr[mid+1]) {
				first+=1;
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,2,6,4,1,5};
		mergesort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
