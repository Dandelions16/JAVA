package com.collection;

import java.util.ArrayList;
import java.util.List;
 
public class ListPlanets {
 
    public static void main(String[] args) {
        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap
        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List
        System.out.println("List planets awal:");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari List
        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}
// List adalah suatu Collection di mana data yang masuk akan disimpan secara teratur. 
// List mempunyai index berdasarkan urutan objek yang dimasukkan ke dalam List.
//  Objek di dalam List bisa duplikat artinya objek yang sama bisa dimasukkan beberapa kali ke dalam List dan akan mempunyai index yang berbeda. 
// Objek dikatakan sama jika dibandingkan menggunakan method equals() menghasilkan nilai true. 
// Hal ini akan berbeda dengan Set yang akan kita bahas berikutnya. Salah satu implementasi dari interface List adalah class ArrayList. 
// ArrayList mirip dengan Array hanya saja ArrayList ukurannya tidak tetap atau fleksibel