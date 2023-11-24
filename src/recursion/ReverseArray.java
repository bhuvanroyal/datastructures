package recursion;

public class ReverseArray {
	
	public static void reverse(int[] arr, int i) {
		if(i==arr.length/2) {
			return;
		}
		int temp=arr[i];
		arr[i]=arr[arr.length-1-i];
		arr[arr.length-1-i]=temp;
		reverse(arr,i+1);
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		reverse(arr,0);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
