package problems;

import java.util.*;
public class MonsterKiller {
	
	public static void  killer(int[] arr, int N) {
		List<Integer> li=new ArrayList<>();
		int mx=-1;
		if(N>0) {
			li.add(1);
			for(int i=1;i<N;i++) {
				if(arr[i]>=arr[i-1]) {
					li.add(1);
				}
				else {
					li.add(li.get(i-1)+1);
				}
			}
		}
		System.out.println(li);
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
        int T=Integer.parseInt(s.nextLine());
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(s.nextLine());
            String str=s.nextLine();
            
            int[] arr = Arrays.stream(str.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            killer(arr,N);
        }

	}

}
