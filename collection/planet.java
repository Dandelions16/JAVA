package com.collection;

public class planet {
  private String name;
    private double mass;
    public planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}
