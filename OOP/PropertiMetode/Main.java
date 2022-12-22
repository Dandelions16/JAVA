package com.OOP.PropertiMetode;

public class Main {
  public static void main(String[] args) {
    // kita tambahkan 1 argumen dengan nilai int 2
    // nilai tersebut adalah nilai yang digunakan untuk inisiasi variable umur

    Hewan kucing = new Hewan(2);
    kucing.makan();
    kucing.jalan();
    kucing.lari();

    // contoh penggunaan fungsi getUmur
    System.out.println("Umurnya adalah  = " + kucing.getUmur());

    // Perhitungan indeks masa tubuh (BMI)
    // Berat(kg) / (tinggi(m)) * tinggi(m))
    double bmi = kucing.getBerat() / ((kucing.getTinggi()* 0.01) * (kucing.getTinggi() * 0.001));
    System.out.println("Indeks massa tubuhnya adalah = "  + bmi);
    // Dari kode di atas ada 2 contoh penggunaan fungsi:
    // Pertama, pemanggilan fungsi getUmur() yang langsung ditampilkan ke dalam output. Tipe data yang dikembalikan adalah int.
    // Kedua, perhitungan indeks massa tubuh dengan menggunakan fungsi getBerat() dan getTinggi(). Tipe data yang dikembalikan adalah double.
  }
  // Bedah code
  // Fungsi getBerat, getTinggi, dan getUmur masing-masing memiliki tipe data sebelum nama fungsinya. 
  // Ia bisa dilihat secara urut double, double, dan int. 
  // Tipe data ini menandakan bahwa metode ini akan mengembalikan nilai yang memiliki tipe data tersebut.

  // Kemudian ada penulisan return, yang wajib dituliskan ketika kita membuat suatu fungsi. 
  // Nilai return yang dikembalikan haruslah memiliki tipe data yang sama dengan tipe data yang dideklarasikan. 
  // Misalnya getUmur memiliki deklarasi tipe int maka nilai return-nya juga harus memiliki tipe data int.
}
