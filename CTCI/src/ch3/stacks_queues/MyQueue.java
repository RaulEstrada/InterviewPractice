package ch3.stacks_queues;

public class MyQueue<T> {
   private Stack<T> ready = new Stack<>();
   private Stack<T> stacked = new Stack<>();
   
   public void queue(T value) {
      stacked.push(value);
   }
   
   public T dequeue() {
      if (ready.getSize() == 0) {
         dumpStacked();
      }
      return ready.pop();
   }
   
   public void dumpStacked() {
      while (stacked.getSize() != 0) {
         T element = stacked.pop();
         ready.push(element);
      }
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