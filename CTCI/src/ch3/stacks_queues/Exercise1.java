package ch3.stacks_queues;
import java.util.*;

public class Exercise1 {
   private List<Integer> elements = new ArrayList<>();
   private List<Integer> minList = new ArrayList<>();
   
   public void push(Integer value) {
      if (getMin() == null || value <= getMin()) {
         minList.add(value);
      }
      elements.add(value);
   }
   
   public Integer pop() {
      if (elements.isEmpty()) {
         return null;
      }
      int poppedValue = elements.remove(elements.size()-1);
      if (getMin() == poppedValue) {
         minList.remove(minList.size()-1);
      }
      return poppedValue;
   }
   
   public Integer getMin() {
      if (minList.isEmpty()) {
         return null;
      }
      return minList.get(minList.size()-1);
   }
}