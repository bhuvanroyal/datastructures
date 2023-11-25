package recursion;
import java.util.*;
public class SubsequencesOfString{
	
	public static void subsequence(String str) {
		
		Queue<String> queue=new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			queue.add(String.valueOf(i));
			while(!queue.isEmpty()) {
				String temp=queue.remove();
				String sum="";
				for(String k:temp.split("")) {
					sum+=String.valueOf(str.charAt(Integer.parseInt(k)));
				}
				System.out.println(sum);
				for(int j=Integer.valueOf(temp.charAt(temp.length()-1));j<str.length();j++) {
					queue.add(temp+String.valueOf(j));
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		String str="abcd";
		subsequence(str);
		

	}

}
