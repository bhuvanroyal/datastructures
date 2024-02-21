package problems;
import java.util.*;
public class Goodcharacter {

	
	public static void solve(int N, String S) {
		char result='z';
		Map<Character,Integer> hm=new HashMap<>();
		int max=0;
		for(int i=0;i<N;i++) {
			int j=N-i;
			if(!hm.containsKey(S.charAt(i))) {
				hm.put(S.charAt(i),j+(j*i));
			}
			else {
				hm.put(S.charAt(i), hm.get(S.charAt(i))+j+(j*i));
			}
			if(max<hm.get(S.charAt(i))) {
				max=hm.get(S.charAt(i));
				result=S.charAt(i);
			}
			if(max==hm.get(S.charAt(i)) && result>S.charAt(i)){
				result=S.charAt(i);
			}
		}
		
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++) {
			int N=Integer.parseInt(sc.nextLine());
			String S=sc.nextLine();
			solve(N,S);
		}
//		System.out.println(16%12);
	}

}
