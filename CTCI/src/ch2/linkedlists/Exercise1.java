package ch2.linkedlists;

import java.util.Set;
import java.util.HashSet;

public class Exercise1 {
	
	/**
	 * Removes duplicates from an unsorted linked list.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param node - Head of the linked list.
	 */
	public void removeDuplicates(Node<Integer> node) {
		if (node == null) {
			return;
		}
		Set<Integer> values = new HashSet<Integer>();
		Node<Integer> previous = node;
		Node<Integer> current = node;
		while (current != null) {
			if (!values.contains(current.getValue())) {
				values.add(current.getValue());
				previous = current;
				current = previous.getNext();
			} else {
				previous.setNext(current.getNext());
				current = previous.getNext();
			}
		}
	}
}
