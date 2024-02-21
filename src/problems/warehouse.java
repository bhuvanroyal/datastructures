package problems;

import java.util.*;
public class warehouse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		int k=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(String i:line.split(" ")) {
			list.add(Integer.valueOf(i));
		}
		Collections.sort(list,Collections.reverseOrder());
		int count=0;
		
		while(!list.isEmpty()) {
			int f=list.get(0);
			if(f>=k) {
				count+=1;
				list.remove(0);
				continue;
			}
			int t=list.get(0);
			int n=t;
			list.remove(0);
			for(int i=0;i<list.size();i++) {
				
					int l=t+list.get(i);
					if(l>k) {
						continue;
					}
					if(l<=k) {
						t+=list.get(i);
						if(0!=i && list.size()>0) {
						list.remove(i);
						count+=1;
						}
					}
			}
			if(t==n) {
				count+=1;
			}
			
		}
		
		System.out.println(count);
		

	}

}
