package ch3.stacks_queues;

public class SortedStack<T extends Comparable> {
   private Stack<T> sorted = new Stack<>();
   private Stack<T> aux = new Stack<>();
   
   public T pop() {
      return sorted.pop();
   }
   
   public void push(T value) {
      while (sorted.peek().compareTo(value) == -1) {
         T element = sorted.pop();
         aux.push(element);
      }
      sorted.push(value);
      while(aux.getSize() > 0) {
         T element = aux.pop();
         sorted.push(element);
      }
   }
   
   public boolean isEmpty() {
      return sorted.getSize() == 0;
   }
   
   public T peek() {
      return sorted.peek();
   }
}

class Stack<T> {
   private StackElement<T> top;
   private int size;
   
   public T pop() {
      if (size == 0) {
         return null;
      }
      T element = top.getElement();
      top = top.getNext();
      size--;
      return element;
   }
   
   public T peek() {
      if (size == 0) {
         return null;
      }
      return top.getElement();
   }
   
   public void push(T element) {
      StackElement<T> newElement = new StackElement<>(element);
      if (top == null) {
         top = newElement;
      } else {
         newElement.setNext(top);
         top = newElement;
      }
      size++;
   }
   
   public int getSize() {
      return this.size;
   }
}

class StackElement<T> {
   private T element;
   private StackElement<T> next;
   
   public StackElement(T element) {
      this.element = element;
   }
   
   public T getElement() {
      return this.element;
   }
   
   public StackElement<T> getNext() {
      return this.next;
   }
   
   public void setNext(StackElement<T> next) {
      this.next = next;
   }
}