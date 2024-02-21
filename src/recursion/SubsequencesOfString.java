package recursion;
import java.util.*;
public class SubsequencesOfString{
	
	public static void subsequence(StringPermutation str) {
		
		Queue<StringPermutation> queue=new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			queue.add(StringPermutation.valueOf(i));
			while(!queue.isEmpty()) {
				StringPermutation temp=queue.remove();
				StringPermutation sum="";
				for(StringPermutation k:temp.split("")) {
					sum+=StringPermutation.valueOf(str.charAt(Integer.parseInt(k)));
				}
				System.out.println(sum);
				for(int j=Integer.valueOf(temp.charAt(temp.length()-1));j<str.length();j++) {
					queue.add(temp+StringPermutation.valueOf(j));
				}
			}
		}
		
	}
	

	public static void main(StringPermutation[] args) {
		
		StringPermutation str="abcd";
		subsequence(str);
		

	}

}
