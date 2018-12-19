package ch2.linkedlists;

public class Exercise2 {
	
	/**
	 * Finds and returns the kth to last element of a singly linked list.
	 * Runtime: O(n)
	 * Memory: O(1)
	 * @param node - Head node of the linked list.
	 * @param k - kth value
	 * @return - Kth to last element
	 */
	public Node<Integer> findKthToLast(Node<Integer> node, int k) {
		Node<Integer> ahead = node;
		for (int i = 0; i < k; i++) {
			ahead = ahead.getNext();
			if (ahead == null) {
				return null;
			}
		}
		Node<Integer> current = node;
		while (ahead != null) {
			current = current.getNext();
			ahead = ahead.getNext();
		}
		return current;
	}
}
