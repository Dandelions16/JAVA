package com.Inharitance;

// Contoh Single Inharitance

class Animal {
  public void walk() {
      System.out.println(getClass().getSimpleName() + " walk!");
  }
}

class Cat extends Animal {
  @Override
  public void walk() {
      System.out.println("Yeay! " + getClass().getSimpleName() + " walk!");
  }
}

public class SingleInharitance {
  
}
