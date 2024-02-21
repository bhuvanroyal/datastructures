package problems;
import java.util.*;
import java.util.stream.Collectors;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.nextLine());
        int S = Integer.parseInt(sc.nextLine());
        int P = Integer.parseInt(sc.nextLine());
        int T = Integer.parseInt(sc.nextLine());

        int[] playerScores = new int[P];
        Arrays.fill(playerScores, 0);
        List<List<Integer>> totalturns=new ArrayList<>();
        
        for(int i=0;i<T;i++) {
        	List<Integer> l=new ArrayList<>();
        	String turn=sc.nextLine();
        	l.add(Integer.parseInt(turn.split(" ")[0]));
        	l.add(Integer.parseInt(turn.split(" ")[1]));
        	l.add(Integer.parseInt(turn.split(" ")[2]));
        	totalturns.add(l);
        }
        
        
        for(int i=0;i<P;i++)
        {
        	HashMap<Integer,Set<Integer>> hm=new HashMap<>();
        	for(List<Integer> turn: totalturns )
        	{
        		if(turn.get(0)==i) {
        			if(!hm.containsKey(turn.get(1))) {
        				Set<Integer> set=new HashSet<>();
        				set.add(turn.get(2));
        				hm.put(turn.get(1),set);
        			}
        			if(hm.containsKey(turn.get(1))) {
        				hm.get(turn.get(1)).add(turn.get(2));
        			}
        			if(!hm.containsKey(turn.get(2))) {
        				Set<Integer> set=new HashSet<>();
        				set.add(turn.get(1));
        				hm.put(turn.get(2),set);
        			}
        			if(hm.containsKey(turn.get(2))) {
        				hm.get(turn.get(2)).add(turn.get(1));
        			}
        			
        		}
        	}
        	System.out.println(hm);
        	int count=0;
        	Set<List<Integer>> polygons=new HashSet<>();
        	for(int k:hm.keySet()) {
    			List<Integer> polygon=new ArrayList<>();
//    			System.out.println(k);
//    			System.out.println(hm);
    			polygon.add(k);
    			count=1;
    			if(hm.get(k).size()==1) {
    				hm.get(k).remove(0);
    				continue;
    			}
    			if(hm.get(k).isEmpty()) {
    				continue;
    			}
    			aa :while(true){
    				
    				int ind=polygon.get(polygon.size()-1);
    				if(k==ind && count>S) {
    					break;
    				}
    			
    				List<Integer> tset=new ArrayList(hm.get(ind));
    				Set<Integer> pset=new HashSet<>(polygon);
    				if(!tset.isEmpty())
    						for(Integer m: tset) {
//    							System.out.println(m);
    							if( count>=S && m==k){
//    								System.out.println(polygon);
    								Collections.sort(polygon);
    								polygons.add(polygon);
    								break aa;
    							}
    							if(hm.get(m).size()<=1 && tset.get(tset.size()-1)==m) {
    								break aa;
    							}
    							if(hm.get(m).size()<=1) {
    								continue;
    							}
    							
    							
    							if(!pset.contains(m)) {
    								if(hm.get(m).size()<=2) {
    									if(hm.get(polygon.size() - 1) != null) {
    										hm.get(polygon.get(polygon.size()-1)).remove(m);
    									}
    									if(count>=S) {
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
        	playerScores[i]=polygons.size();
        }
      for(int i=0;i<P;i++) {
    	  System.out.print(playerScores[i] +", ");
      }
    }
}

