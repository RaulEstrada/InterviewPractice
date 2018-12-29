package ch3.stacks_queues;

import java.util.List;
import java.util.ArrayList;

public class StackOfStacks<T> {
   private List<Stack<T>> stacks = new ArrayList<>();
   private int stackCapacity;
   
   public StackOfStacks(int stackCapacity) {
      this.stackCapacity = stackCapacity;
   }
   
   public void push(T value) {
      getCurrentStack().push(value);
   }
   
   public T pop() {
      return popAt(stacks.size()-1);
   }
   
   public T popAt(int index) {
      if (index < 0 || index > stacks.size() - 1) {
         return null;
      }
      Stack<T> stack = stacks.get(index);
      T element = stack.pop();
      if (stack.getSize() == 0) {
         stacks.remove(index);
      }
      return element;
   }
   
   private Stack<T> getCurrentStack() {
      if (stacks.isEmpty() || 
         stacks.get(stacks.size()-1).getSize() == stackCapacity) {
         Stack<T> newStack = new Stack<T>();
         stacks.add(newStack);
      }
      return stacks.get(stacks.size()-1);
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