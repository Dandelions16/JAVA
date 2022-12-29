package com.Casting;

public class UpcastingDowncasting {
  public static void main(String[] args) {
    Kucing angora = new Kucing();
    // Setelah itu kita buat kelas Main, 
    // lalu kita instansiasi objek kucing anggora yang mereferensi variabel tipe kucing.

    Hewan hewan = angora; // Secara implisit upcasting
    // Kita juga bisa menetapkan referensi anggora menjadi variabel tipe hewan. 
    // Karena pada kasus ini kucing adalah subclass sementara hewan adalah superclass.
    // Dan pada saat kita menetapkan referensinya (assign).

    hewan = (Hewan) angora; // Secara explisit melakukan casting dari subclass ke superclass
    // Pada kode program sebelumnya telah dilakukan upcasting secara implisit.
    // Sementara untuk kode program di atas kita lakukan upcasting secara eksplisit.
    //  Kita tidak perlu melakukan upcasting secara eksplisit, karena pada Java,
    //  kompiler akan mengetahui bila kelas tersebut ada hubungan inheritance. 
    // Apabila kita hendak menggunakan metode yang terdapat pada kelas kucing untuk objek hewan, 
    // hal tersebut tidak dapat dilakukan misalnya hewan.meow(). Untuk bisa melakukannya, 
    // kita bisa melakukan downcasting.

    Hewan hewan2 = new Kucing();
    ((Kucing)hewan2).meow(); // Downcast hewan ke kucing, casting dari superclass ke subclass

    // Sebelumnya kita telah mereferensikan variabel hewan ke instans kucing. 
    // Dan ketika ingin menggunakan metode yang ada pada kelas kucing kita bisa menggunakan downcast 
    // seperti pada kode program di atas untuk menggunakan metode meow yang terdapat pada kelas kucing. 
    // Downcast dilakukan hanya pada instans kucing.


  }
}
