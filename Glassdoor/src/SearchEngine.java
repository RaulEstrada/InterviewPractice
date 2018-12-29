import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchEngine {
	private Map<String, Integer> prefScore = new HashMap<String, Integer>();
	
	public void updateTrie(String word, int score) {
		String cumm = "";
		for (char letter : word.toCharArray()) {
			cumm += letter;
			int previous = prefScore.getOrDefault(cumm, 0);
			prefScore.put(cumm, Math.max(previous, score));
		}
	}
	
	public static void main(String[] args) {
		SearchEngine se = new SearchEngine();
		Scanner scanner = new Scanner(System.in);
		String entriesStr = scanner.nextLine();
		String[] entriesParts = entriesStr.split("\\s+");
		int numEntries = Integer.parseInt(entriesParts[0]);
		for (int i=0; i < numEntries; i++) {
			String line = scanner.nextLine();
			String[] parts = line.split("\\s+");
			se.updateTrie(parts[0], Integer.parseInt(parts[1]));
			
		}
		int numQueries = Integer.parseInt(entriesParts[1]);
		for (int i = 0; i < numQueries; i++) {
			String query = scanner.nextLine();
			if (se.prefScore.containsKey(query)) {
				System.out.println(se.prefScore.get(query));
			} else {
				System.out.println(-1);
			}
		}
		scanner.close();
	}
}
