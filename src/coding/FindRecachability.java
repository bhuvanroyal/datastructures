package coding;
import java.util.*;
public class FindRecachability {
	
	public static boolean reachability(Map<Long,List<Long>> hm,long A,long B) {
		Stack<Long> stack=new Stack<>();
		Set<Long> set=new HashSet<>();
		stack.push(A);
		while(!stack.isEmpty()) {
			Long current=stack.pop();
			set.add(current);
			for(long n:hm.get(current)) {
				if(!set.contains(n)) {
					stack.push(n);
						if(B==n) {
						return true;
						}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<Long,List<Long>> hm=new HashMap<>();
		long N=Long.parseLong(sc.nextLine());
		for(long i=0;i<N;i++) {
			long member=Long.parseLong(sc.nextLine());
			hm.put(member, new ArrayList<Long>());
		}
		long edges=Long.parseLong(sc.nextLine());
		for(long i=0;i<edges;i++) {
			String e=sc.nextLine();
			hm.get(Long.parseLong(e.split(" ")[0])).add(Long.parseLong(e.split(" ")[1]));
		}
		long A=Long.parseLong(sc.nextLine());
		long B=Long.parseLong(sc.nextLine());
		System.out.println(hm);
		
		if(reachability(hm,A,B)) {
			System.out.println("connection is there");
		}
		else {
			System.out.println("No connection");
		}
		

	}

}
