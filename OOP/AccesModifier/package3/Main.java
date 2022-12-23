package com.OOP.AccesModifier.package3;

public class Main {
  public static void main(String[] args) {
    System.out.println("Nilainya adalah " + Perhitungan.nilai);

    // Dan perlu diketahui juga bahwa static variable hanya berjumlah satu, tak  peduli berapapun obyek yang dibuat. 
    // Sebagai contoh kita modifikasi kelas Perhitungan dengan menambahkan konstruktor, seperti di bawah ini.
    // Perhitungan() {
      // nilai++;
    // }

    // Pembuatan objek kelas perhitungan sebanyak 5 kali seperti dibawah ini:
    for(int x = 0 ; x <5; x++){
        new Perhitungan();
    }
    System.out.println("Sampai "  + Perhitungan.nilai);
    
    // Static Methods
    // Metode yang berdiri sendiri tanpa perlu instance dari kelas.

    // Sekarang tambahkan kode berikut di kelas perhitungan:
    // protected static int getNilai() {
    //   return nilai;
    // }

    // Untuk mengakses kelas perhitungan diatas, kita tidak perlu membuat objeknya didalam kelas Main:
    System.out.println("getNilai meiliki nilai "  + Perhitungan.getNilai());

    // Final
    // Non accces modifier kedua adalah nilai. Ada 3 maca penggunan non access modifier final yaitu
    // final variable, final methods dan final class.
    // Sekarang mari kita pindah ke kelas perhitungan untuk mencoba non access modifier
  }
}
