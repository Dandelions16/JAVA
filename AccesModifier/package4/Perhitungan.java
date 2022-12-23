package com.OOP.AccesModifier.package4;

import java.io.Serializable;

public class Perhitungan {
  // Final Variable
  // Perhatikan contoh kode dibawah ini:
  final int nilai = 5;
  void ubahNilai(){
    // kode dibawah ini akan menghasilkan error
    nilai = 10;
  }
  // Kode diatas akan eror karena kita mencoba mengganti variable nilai dengan objek baru.
  // Biasanya final digunakan bersamaan dengan static untuk membuat konstanta. Misalnya contoh kode 
  // konstanta nilai PI dilingkaran, seperti dibawah ini:
  // static final double PI = 3.141;

  // Final Methods
  // Metode yang dideklarasikan final maka tidak dapat di override oleh anak kelas. Ini akan berguna jika ingin
  // membuat metode yang tidak dapat diubah. Contoh kodenya adalah seperti ini:
  static final double PI = 3.141;

  int jari = 7;

  final double getLuas(){
    return PI * (jari * jari);
  }

  // Final Class
  // Kelas yang dideklarasikan sebagai final maka tidak bisa dijadikan sebagai induk kelas.
  final class Lingkaran{

  }

  // Transient
  // Transient memiliki hubungan dengan proses serialisasi (serializing). 
  // Serialisasi adalah proses konversi suatu objek menjadi byte agar dapat ditransmisikan.

  // Variabel yang dideklarasikan sebagai transient maka akan tidak dijaga nilainya di dalam proses serialisasi. 
  // Contoh penggunaannya adalah seperti ini.

  /**
   * Test implements Serializable
   */
  class Test implements Serializable {
    // variable ini tidak akan dijaga nilainya
    transient int nilaiA;

    // variable ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;
  }
  
  // Synchronized
  // Synchronized modifier digunakan untuk membatasi akses ke suatu variable/methods yang hanya boleh
  // dilakukan oleh satu thread. Ketika ada 2 thread yang ingin mengakses synchronized variable/methods, 
  // maka prosesnya akan dilakukan secara serial (bergantian).

  // contoh pengunaanya seperti ini:
  public synchronized void showData(){
    
  }
}
