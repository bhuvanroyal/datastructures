package problems;

import java.util.*;
public class bubblesort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String line1=sc.nextLine();
		String line2=sc.nextLine();
		
		List<String> list1=new ArrayList<>(Arrays.asList(line1.split(" ")));
		List<String> list2=new ArrayList<>(Arrays.asList(line2.split(" ")));
		for(int i=list1.size()-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(Integer.parseInt(list1.get(j)) > Integer.parseInt(list1.get(j+1))){
					String temp1=list1.get(j);
					String temp2=list2.get(j);
					list1.set(j, list1.get(j+1));
					list1.set(j+1, temp1);
					
					list2.set(j, list2.get(j+1));
					list2.set(j+1, temp2);
				}
			}
		}
		
		for(String i:list2) {
			System.out.print(i +" ");
		}

	}

}
