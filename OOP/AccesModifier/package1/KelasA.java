package com.OOP.AccesModifier.package1;

public class KelasA {
  private int memberA = 5;

  static char memberB = 'A';
  static double memberC = 1.5;
  //  Ada 2 member yaitu memberB dan memberC. Keduanya tidak memiliki access modifier maka keduanya adalah termasuk default. 
  // Dan lihat juga functionB, fungsi ini juga termasuk default modifier. 
  // Terakhir, KelasA juga merupakan default modifier karena tidak memiliki access modifier.

  private int functionA(){
    return memberA;
  }

  int functionB(){
    // Pemanggilan private member dan private function
    int hasil = functionA() + memberA;
    return hasil;
    // Dari kode di atas dapat dilihat bahwa ada kelas dengan nama KelasA. 
    // Di dalamnya ada 2 contoh kode yang menggunakan modifier private yaitu memberA dan functionA. 
    // Variabel memberA memiliki tipe data integer dengan nilainya 5. 
    // Sementara fungsi functionA memiliki nilai balik integer yang di ambil dari memberA, 
    // ini berarti functionA juga akan mengembalikan nilai 5. Kemudian yang perlu diperhatikan adalah pada fungsi functionB. 
    // Di dalamnya ada akses ke member private dan fungsi private. Jika dijalankan maka nilai yang didapatkan adalah 10 (5+5). 
    // Oleh karena itu, kode di atas merupakan contoh dari modifier private di mana akses ke variabel/fungsi hanya dari kelas tersebut.
  }
  protected void methodC() {
    System.out.println("Percobaan acces modifier!!!");
    // Selanjutnya buatlah kelas baru dengan KelasB yang merupakan turunan dari KelasA di package2.
  }
}
