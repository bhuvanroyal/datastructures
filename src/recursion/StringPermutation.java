package recursion;
import java.io.StringBufferInputStream;
import java.util.*;
public class StringPermutation {
	
	public static void kthPermutation(int current,int n, StringBuilder str,Set<Integer>visited,StringBuilder res,int[] k)
    {
		
		if(str.length()==n) {
			if(k[0]==1) {
			res.append(str);
			}
			k[0]-=1;	
		}
        for(int i=1;i<=n;i++) {
        	if(!visited.contains(i)) {
        		visited.add(i);
        		str.append(String.valueOf(i));
        		kthPermutation(i+1,n,str,visited,res,k);
        		str.deleteCharAt(str.length()-1);
        		visited.remove(i);
        	}
        }
        
    }
	
	
	public static void main(String[] args) {
		
		int n=4;
		int k=18;
		int p=1;
		for(int i=1;i<=n;i++) {
			p*=i;
		}
		int c=p/n;
		int start=0;
		if(k%c!=0) {
			start=k/c+1;
		}else {
			start=k/c;
		}
		
		System.out.println(start);
		k-=((start-1)*c);
		
		int[] arr=new int[1];
		arr[0]=k;
		StringBuilder res=new StringBuilder();
		Set<Integer> visited=new HashSet<>();
		StringBuilder str=new StringBuilder();
		str.append(start);
		visited.add(start);
		kthPermutation(start,n,str,visited,res,arr);
//		System.out.println(res);
		
	}

}
