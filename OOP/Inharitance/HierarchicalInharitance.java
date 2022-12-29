package com.Inharitance;

class Animal {
  public void walk() {
      System.out.println(getClass().getSimpleName() + " walk!");
  }
}

class Carnivore extends Animal {
  public void eat() {
      System.out.println("Yeay! " + getClass().getSimpleName() + " eat!");
  }
}

class Cat extends Carnivore {

}

class Lion extends Carnivore {

}

class Dog extends Carnivore {
  
}

public class HierarchicalInharitance {
  
}
