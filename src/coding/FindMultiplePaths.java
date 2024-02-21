package coding;
import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Graphs {
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }
}
public class FindMultiplePaths {
	

    	private static Set<Integer> visited = new HashSet<>();
        private static List<List<Integer>> allPaths = new ArrayList<>();
        private static Set<Integer> commonNeighbors = new HashSet<>();

        public static void findPaths(Graphs graph, int start, int target, List<Integer> currentPath,int A) {
        	visited.add(start);

            if (start == target) {
                allPaths.add(new ArrayList<>(currentPath));
            } else {
                for (int neighbor : graph.getNeighbors(start)) {
                    if (!visited.contains(neighbor) && !commonNeighbors.contains(neighbor)) {  // Ensure both conditions
                        currentPath.add(start);
                        commonNeighbors.add(neighbor);
                        findPaths(graph, neighbor, target, currentPath,A);
                        currentPath.remove(currentPath.size() - 1);
                        commonNeighbors.remove(neighbor);
                    } else if (start != A) { 
                        break;
                    }
                }
            }

            visited.remove(start);
        }
    public static void main(String[] args) {
        Graphs graph = new Graphs();
        // Add edges as per the input
        graph.addEdge(2, 4);
        graph.addEdge(2, 9);
        graph.addEdge(7, 2);
        graph.addEdge(7, 9);
        graph.addEdge(9, 6);
        graph.addEdge(4, 6);
        graph.addEdge(5, 7);
        graph.addEdge(9, 5);
        graph.addEdge(6, 5);
        graph.addEdge(4, 8);
        graph.addEdge(8, 6);
        graph.addEdge(4, 10);
        graph.addEdge(10, 6);

        int start = 7;
        int target = 6;

        findPaths(graph, start, target, new ArrayList<>(),start);

        if (!allPaths.isEmpty()) {
            System.out.println("All paths from " + start + " to " + target + ":");
            for (List<Integer> path : allPaths) {
                System.out.println(path);
            }
        } else {
            System.out.println("No paths found from " + start + " to " + target);
        }
    }0
}
