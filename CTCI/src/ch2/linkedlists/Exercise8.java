package ch2.linkedlists;

public class Exercise8 {
	/**
	 * Given a circular linkedlist, this method returns the node at the beginning
	 * of the loop.
	 * Runtime: O(n)
	 * Memory: O(1)
	 * @param node - Head of linked list
	 * @return - Node at the beginning of the loop
	 */
	public Node<Integer> findCircularLoopHead(Node<Integer> node) {
		Node<Integer> slow = node;
		Node<Integer> fast = node;
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if (slow == fast) {
				break;
			}
		}
		slow = node;
		while (slow != fast) {
			slow = slow.getNext();
			fast = fast.getNext();
		}
		return slow;
	}
}