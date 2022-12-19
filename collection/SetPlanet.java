package com.collection;

 import java.util.*;
 
public class SetPlanet {
  public static void main(String[] args) {
    // menggunakan HashSet
    Set<String> planets = new HashSet<>();
    planets.add("mercury"); // method add() untuk menambahkan objek ke Set
    planets.add("venus");
    planets.add("earth");
    planets.add("earth"); // menambahkan objek "earth" beberapa kali
    planets.add("earth");
    planets.add("mars"); // objek bisa terus ditambahkan ke Set

    // method size() untuk mendapatkan ukuran Set
    System.out.println("Set planets awal: (size = " + planets.size() + ")");
    for (String planet : planets) {
        System.out.println("\t " + planet);
    }

    planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

    System.out.println("Set planets akhir: (size = " + planets.size() + ")");
    for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
        // looping menggunakan Iterator
        System.out.println("\t" + iterator.next());
    }
  }
}
// Set mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi. 
// Yang artinya jika objek yang sama dimasukkan beberapa kali ke dalam Set maka Set hanya akan menyimpan objek tersebut satu kali saja.
// Coba ingat kembali materi Inheritance bagian Overriding dan Overloading. 
// Perbedaan lain antara Set dengan List adalah penyimpanan pada Set tidak teratur.


