package ch2.linkedlists;

import java.util.Stack;

public class Exercise5 {
	
	/**
	 * We have 2 numbers represented by a linked list, where each node contains a 
	 * single digit. The digits are stored in reverse order. This method
	 * adds the two numbers and returns the sum as a linked list.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param a - First number
	 * @param b - Second number
	 * @return - Addition
	 */
	public Node<Integer> sumBackwards(Node<Integer> a, Node<Integer> b) {
		Node<Integer> current = new Node<Integer>(0);
		Node<Integer> head = current;
		int carried = 0;
		while (a != null || b != null) {
			int currentValue = carried;
			if (a != null) {
				currentValue += a.getValue();
				a = a.getNext();
			}
			if (b != null) {
				currentValue += b.getValue();
				b = b.getNext();
			}
			carried = currentValue / 10;
			currentValue %= 10;
			current.setValue(currentValue);
			current.setNext(new Node<Integer>(0));
			current = current.getNext();
		}
		current.setValue(carried);
		return head;
	}
	
	/**
	 * We have 2 numbers represented by a linked list, where each node contains a 
	 * single digit. The digits are stored in correct order. This method
	 * adds the two numbers and returns the sum as a linked list.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param a - First number
	 * @param b - Second number
	 * @return - Addition
	 */
	public Node<Integer> sumForward(Node<Integer> a, Node<Integer> b) {
		Stack<Integer> stackA = createLinkedStack(a);
		Stack<Integer> stackB = createLinkedStack(b);
		Node<Integer> res = new Node<>(0);
		int carried = 0;
		while (!stackA.isEmpty() || !stackB.isEmpty()) {
			int currentValue = carried;
			if (!stackA.isEmpty()) {
				currentValue += stackA.pop();
			}
			if (!stackB.isEmpty()) {
				currentValue += stackB.pop();
			}
			carried = currentValue / 10;
			res.setValue(currentValue%10);
			Node<Integer> node = new Node<>(0);
			node.setNext(res);
			res = node;
		}
		res.setValue(carried);
		return res;
	}
	
	private Stack<Integer> createLinkedStack(Node<Integer> node) {
		Stack<Integer> st = new Stack<>();
		while (node != null) {
			st.push(node.getValue());
			node = node.getNext();
		}
		return st;
	}
}
