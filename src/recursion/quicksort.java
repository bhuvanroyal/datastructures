package recursion;

public class quicksort {
	
	public static int mergeIndex(int[] arr,int low, int high) {
		int pivot=low;
		for(int i=pivot+1;i<=high;i++) {
			if(arr[pivot]>arr[i]) {
				low+=1;
				int t=arr[low];
				arr[low]=arr[i];
				arr[i]=t;
			}
		}
		int t=arr[low];
		arr[low]=arr[pivot];
		arr[pivot]=t;
		return low;
	}
	
	public static void quicksortfunc(int[]arr, int low, int high) {
		if(low<high) {
		int ind=mergeIndex(arr,low,high);
		quicksortfunc(arr,low,ind-1);
		quicksortfunc(arr,ind+1,high);
		}
	}

	public static void main(StringPermutation[] args) {
		
		int[]arr= {4,6,1,7,3,2,5};
		
		quicksortfunc(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +",");
		}
		

	}

}
