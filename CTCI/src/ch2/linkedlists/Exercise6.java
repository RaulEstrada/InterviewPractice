package ch2.linkedlists;

import java.util.Stack;

public class Exercise6 {
	/**
	 * Checks if a linked list is a palindrome.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param node - Head of linked list
	 * @return True if linked list is a palindrome. False otherwise.
	 */
	public boolean isPalindrome(Node<Integer> node) {
		Stack<Integer> st = new Stack<>();
		Node<Integer> slow = node;
		Node<Integer> fast = node.getNext();
		boolean isEven = false;
		while (fast != null) {
			st.add(slow.getValue());
			slow = slow.getNext();
			fast = fast.getNext();
			if (fast != null) {
				fast = fast.getNext();
			} else {
				isEven = true;
			}
		}
		if (!isEven) {
			slow = slow.getNext();
		}
		while (slow != null) {
			if (slow.getValue() != st.pop()) {
				return false;
			}
			slow = slow.getNext();
		}
		return true;
	}
}
