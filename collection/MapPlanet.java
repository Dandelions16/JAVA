package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
  public static void main(String[] args) {
    // menggunakan HashMap
    Map<String, planet> planets = new HashMap();
    planets.put("key-1", new planet("Mercury", 0.06)); // method put() untuk menambahkan objek ke Map
    planets.put("key-2", new planet("Venus", 0.82));
    planets.put("key-3", new planet("Earth", 1.00));
    planets.put("key-4", new planet("Mars", 0.11));
    planets.put("key-4", new planet("Mars-X", 0.11)); // menambahkan ke Map dengan key yang sama

    // method size() untuk mendapatkan ukuran Set
    System.out.println("Map planets awal: (size = "+ planets.size() +")");
    for (String key : planets.keySet()) { // looping key dari Map
        // method get() untuk melihat isi Map berdasarkan key
        System.out.println("\t " + key + " : " + planets.get(key));
    }

    planets.remove("key-2"); // method remove() untuk mengeluarkan objek dari Map

    System.out.println("Map planets akhir: (size = "+ planets.size() +")");
    for (planet planet : planets.values()) { // looping value dari Map
        System.out.println("\t " + planet);
    }
  }
}

// Perhatikan. Jika menambahkan dengan key yang sama maka value akan diganti. 
// Lebih lanjut, sama halnya pada Set, objek yang dimasukkan ke Map tidak teratur urutannya.

// Map adalah struktur data dalam bentuk pasangan key-value. Map sama dengan “associative array “ dalam bahasa PHP.
// Objek disimpan di Map sebagai value menggunakan key yang harus unik dan harus berupa objek juga. 
// Salah satu implementasi dari interface Map adalah class HashMap. 

// Pada dasarnya Collection adalah struktur data. Makin kompleks struktur datanya maka akan dibutuhkan implementasi Collection yang lebih kompleks lagi.
//  Pada materi ini kita hanya membahas Collection yang sudah ada di JDK tanpa menambahkan library apapun.
//  Di luar sana ada banyak library Collection untuk keperluan yang kompleks misal Apache Common Collection dan Google Collection (sekarang menjadi bagian dari Guava).

// Baca beberapa tautan di bawah ini untuk menambah pengetahuan Anda.

// https://commons.apache.org/proper/commons-collections/
// https://code.google.com/archive/p/google-collections/
// https://github.com/google/guava