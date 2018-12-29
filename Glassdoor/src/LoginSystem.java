import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
	private static Node trieRoot = new Node();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numUsersStr = scanner.nextLine();
		int numUsers = Integer.parseInt(numUsersStr);
		for (int i=0; i < numUsers; i++) {
			System.out.println(trieRoot.optimalSearch(scanner.nextLine()));
		}
		scanner.close();
	}
}

class Node {
	private Map<String, Integer> children = new HashMap<>();
	
	public String optimalSearch(String requested) {
		if (!children.containsKey(requested)) {
			children.put(requested, -1);
			return requested;
		}
		int suggested = children.get(requested) + 1;
		while (children.containsKey(requested + suggested)) {
			suggested++;
		}
		String result = requested + suggested;
		children.put(result, -1);
		children.put(requested, suggested);
		return result;
	}
}