package ch2.linkedlists;

public class Exercise3 {
	/**
	 * Deletes a node in the middle of a singly linked list, given only access to that node.
	 * Runtime: O(n)
	 * Memory: O(1)
	 * @param node - Element to delete
	 */
	public void deleteMiddleNode(Node<Integer> node) {
		while (node.getNext().getNext() != null) {
			node.setValue(node.getNext().getValue());
			node = node.getNext();
		}
		node.setValue(node.getNext().getValue());
		node.setNext(null);
	}
}
