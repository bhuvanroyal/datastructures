package problems;
import java.util.*;

public class graph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=6;
		int p=2;
		int T=11;
		Set<List<Integer>> polygons=new HashSet<>();
		HashMap<Integer,Set<Integer>> hm=new HashMap<>();
//		int[][] a={{0,1},{0,4},{0,5},{1,4},{5,4}};
//		int[][] a={{2,0},{2,1},{2,5},{2,4},{2,3},{5,3}};
		int[][] a={{0,1,}};
		for(int[] ar : a) {
			if(!hm.containsKey(ar[0])) {
				Set<Integer> set=new HashSet<>();
				set.add(ar[1]);
				hm.put(ar[0],set);
			}
			if(hm.containsKey(ar[0])) {
				hm.get(ar[0]).add(ar[1]);
			}
			if(!hm.containsKey(ar[1])) {
				Set<Integer> set=new HashSet<>();
				set.add(ar[0]);
				hm.put(ar[1],set);
			}
			if(hm.containsKey(ar[1])) {
				hm.get(ar[1]).add(ar[0]);
			}
		}
		int count = 0;
		System.out.println(hm);
		for(int i:hm.keySet()) {
			List<Integer> polygon=new ArrayList<>();

			polygon.add(i);
			count=1;
			if(hm.get(i).size()==1) {
				hm.get(i).remove(0);
				continue;
			}
			if(hm.get(i).isEmpty()) {
				continue;
			}
			aa :while(true){
				
				int ind=polygon.get(polygon.size()-1);
				if(i==ind && count>2) {
					break;
				}
			
				List<Integer> tset=new ArrayList(hm.get(ind));
				Set<Integer> pset=new HashSet<>(polygon);
				if(!tset.isEmpty())
						for(Integer m: tset) {
							
							if( count>2 && m==i){
								Collections.sort(polygon);
								polygons.add(polygon);
								break aa;
							}
							if(hm.get(m).size()<=1) {
								continue;
							}
							if(!pset.contains(m)) {
								if(hm.get(m).size()<=2) {
									if(hm.get(polygon.size() - 1) != null) {
										hm.get(polygon.size()-1).remove(m);
									}
									if(count>=3) {
										break aa;
									}
								}
								polygon.add(m);
								count+=1;
								break;
							}
						}
				}
				
			}
		System.out.println(polygons);
			
		}
	
	}








//V=int(input());
//P=int(input());
//S=int(input());
//T=int(input());
//player_scores=[0]*P;
//vertex_color=[[-1] * V for _ in range(V)]
//for _ in range(T):
//	turn_info = input().split()
//	player, v1, v2 =int(turn_info[0]), int(turn_info[1]), int(turn_info[2])
//	if vertex_color[v1][v2]==-1:
//		vertex_color[v1][v2]=player
//		vertex_color[v2][v1]=player
//		count=0
//		for i in range(V):
//			for j in range(i+1, V):
//				for k in range(j+1, V):
//					if (
//						vertex_color[i][j]==player
//						and vertex_color[j][k]==player
//						and vertex_color[k][i]==player
//							):
//							count+=1
//		player_scores[player]=count;
//print(" ".join(map(str,player_scores)))
						
























