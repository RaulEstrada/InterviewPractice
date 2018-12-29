package ch3.stacks_queues;

public class AnimalShelter {
   private ShelterElement<Dog> headerDogs;
   private ShelterElement<Dog> tailDogs;
   private ShelterElement<Cat> headerCats;
   private ShelterElement<Cat> tailCats;
   private int counter;
   
   private int getCounter() {
      return counter;
   }
   
   public void enqueue(Dog dog) {
      ShelterElement<Dog> element = new ShelterElement(dog, getCounter());
      if (tailDogs == null) {
         headerDogs = element;
      } else {
         tailDogs.setNext(element);
      }
      tailDogs = element;
      counter++;
   }
 
   public void enqueue(Cat cat) {
      ShelterElement<Cat> element = new ShelterElement(cat, getCounter());
      if (tailCats == null) {
         headerCats = element;
      } else {
         tailCats.setNext(element);
      }
      tailCats = element;
      counter++;
   }
   
   public Dog dequeueDog() {
      Dog result = headerDogs.getAnimal();
      headerDogs = headerDogs.getNext();
      if (headerDogs == null) {
         tailDogs = null;
      }
      return result;
   }
   
   public Cat dequeueCat() {
      Cat result = headerCats.getAnimal();
      headerCats = headerCats.getNext();
      if (headerCats == null) {
         tailCats = null;
      }
      return result;
   }
   
   public Animal dequeueAny() {
      if (headerDogs == null) {
         return dequeueCat();
      } 
      if (headerCats == null) {
         return dequeueDog();
      }
      if (headerDogs.getNumber() < headerCats.getNumber()) {
         return dequeueDog();
      } else {
         return dequeueCat();
      }
   }
  
}

class ShelterElement<T extends Animal> {
   private T animal;
   private int number;
   private ShelterElement<T> next;
   
   public ShelterElement(T animal, int number) {
      this.animal = animal;
      this.number = number;
   }
   
   public int getNumber() {
      return number;
   }
   
   public T getAnimal() {
      return animal;
   }
   
   public ShelterElement<T> getNext() {
      return next;
   }
   
   public void setNext(ShelterElement<T> next) {
      this.next = next;
   }
}

interface Animal {}

class Dog implements Animal {}

class Cat implements Animal {}