package ch2.linkedlists;

public class Exercise4 {
	
	/**
	 * Partitions a linked list around a value x, such that all nodes less than x come
	 * before all nodes greater than or equal to x.
	 * Runtime: O(n)
	 * Memory: O(1) In-place
	 * @param node - The head of the linked list
	 * @param value - The value to partition around.
	 */
	public void partition(Node<Integer> node, int value) {
		Node<Integer> i = node, j = node;
		while (j != null) {
			if (j.getValue() >= value) {
				j = j.getNext();
			} else {
				int tmp = i.getValue();
				i.setValue(j.getValue());
				j.setValue(tmp);
				j = j.getNext();
			}
			if (i.getValue() < value) {
				i = i.getNext();
			}
		}
	}
}
