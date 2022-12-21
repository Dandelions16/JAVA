package com.OOP.Object;

public class Main1 {
  public static void main(String[] args) {
    Binatang Elang = new Binatang("Elang");
    Binatang Kucing = new Binatang("Kucing");

    Elang.beratBinatang(5);
    Elang.jumlahkakiBinatang(2);
    Elang.cetakBinatang();

    Kucing.beratBinatang(10);
    Kucing.jumlahkakiBinatang(4);
    Kucing.cetakBinatang();
  }
}
// Kini kita telah memahami cara membuat kelas dan menginstansiasinya pada Java. Ada yang perlu kita tekankan dalam bab ini . 
// Dalam sebuah kelas kita bisa menciptakan beberapa objek. 
// Dengan menggunakan objek kita dapat mengeksekusi baik metode maupun fungsi yang beraneka ragam,
// yang dipakai dalam sebuah kelas.