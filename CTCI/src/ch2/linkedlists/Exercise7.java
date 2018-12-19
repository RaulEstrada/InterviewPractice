package ch2.linkedlists;

import java.util.Stack;

public class Exercise7 {
	/**
	 * Given two singly linked lists, determines if the two lists intersect and returns 
	 * the intersecting node. Intersection is defined based on reference, not value.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param nodeA - Head node of the first linked list.
	 * @param nodeB - Head node of the second linked list.
	 * @return - Intersecting node, or null if they don't intersect.
	 */
	public Node<Integer> findIntersection(Node<Integer> nodeA, Node<Integer> nodeB) {
		Stack<Node<Integer>> stackA = createLinkedListStack(nodeA);
		Stack<Node<Integer>> stackB = createLinkedListStack(nodeB);
		Node<Integer> result = null;
		while (!stackA.isEmpty() && !stackB.isEmpty()) {
			Node<Integer> a = stackA.pop();
			Node<Integer> b = stackB.pop();
			if (a == b) {
				result = a;
			}
		}
		return result;
	}

	private Stack<Node<Integer>> createLinkedListStack(Node<Integer> node) {
		Stack<Node<Integer>> st = new Stack<>();
		while (node != null) {
			st.add(node);
			node = node.getNext();
		}
		return st;
	}
}