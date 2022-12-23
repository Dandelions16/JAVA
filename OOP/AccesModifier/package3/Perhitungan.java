package com.OOP.AccesModifier.package3;


public class Perhitungan {
  public static int nilai = 0;
  // Untuk mengakses kelas perhitungan di atas, kita tidak perlu membuat objeknya di dalam kelas Main
  
  protected static int getNilai(){
    return nilai;
  }

  // konstruktor
  Perhitungan(){
    nilai++;
    // Kemudian tes pembuatan objek kelas perhitungan sebanyak 5 kali dikelas Main
  }
}
