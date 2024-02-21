package problems;
import java.util.*;
public class Simgame {

	public static int countCommonVertices(List<Integer> line1, List<Integer> line2) {
		Set<Integer> vertices = new HashSet<>();
		vertices.add(line1.get(0));
		vertices.add(line1.get(1));
		vertices.add(line2.get(0));
		vertices.add(line2.get(1));

		return vertices.size(); // Number of common vertices
	}

	public static boolean isPolygonValid(List<List<Integer>> lines, int sides) {
		// Check if all lines share at least one vertex with at least one other line
		for (int i = 0; i < lines.size(); i++) {
			for (int j = i + 1; j < lines.size(); j++) {
				if (countCommonVertices(lines.get(i), lines.get(j)) > 0) {
					break;
				}
				if (j == lines.size() - 1) {
					return false;
				}
			}
		}

		// Check if all vertices are connected to at least two other vertices
		Set<Integer> connectedVertices = new HashSet<>();
		for (List<Integer> line : lines) {
			connectedVertices.add(line.get(0));
			connectedVertices.add(line.get(1));
		}
		return connectedVertices.size() == sides + 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the number of vertices
		int V = scanner.nextInt();

		// Input the number of sides for convex polygons
		int S = scanner.nextInt();

		// Input the number of players
		int P = scanner.nextInt();

		// Input the total number of turns
		int T = scanner.nextInt();

		// Create a map to store the lines drawn by each player
		Map<Integer, List<List<Integer>>> playerLines = new HashMap<>();

		// Input details of each turn
		for (int i = 0; i < T; i++) {
			int player = scanner.nextInt();
			int vertex1 = scanner.nextInt();
			int vertex2 = scanner.nextInt();

			playerLines.putIfAbsent(player, new ArrayList<>());
			Integer[] arr = { vertex1, vertex2 };
			List<Integer> list = Arrays.asList(arr);
			playerLines.get(player).add(list);
		}

		// Calculate the score for each player
		int[] scores = new int[P];

		// Iterate through each player's lines
		for (Map.Entry<Integer, List<List<Integer>>> entry : playerLines.entrySet()) {
			List<List<Integer>> lines = entry.getValue();

			if (isPolygonValid(lines, S)) {
				scores[entry.getKey()] += lines.size(); // Corrected line
			}
		}

		for (int i = 0; i < P; i++) {
			System.out.print("Player " + i + " scores " + scores[i] + " ");
		}
	}
}