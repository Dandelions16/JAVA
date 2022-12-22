package com.OOP.PropertiMetode;

public class Hewan {
  
  // Properti atau fields
  // Contoh dibawah ini
  // double tinggi;
  // double berat;
  // int umur;

  // Kita bisa melakukan inisiasi dari properti dengan menggunakan nilai inisial atau parameter dari konstruktor.
  // Misalnya seperti ini:

  // Properti atau fields
  // inisiasi dengan nilai inisial
  double tinggi = 30;
  double berat = 3;

  // insisiasi dengan konstruktor
  int umur;

  // Konstruktor dengan parameter
  // Hewan(int umurParam){
    // umur = umurParam;
    // Perhatikan parameter umurParam dan umur. Pada dasarnya keduanya adalah variabel yang bertipe sama, 
    // tapi kedudukannya berbeda. Variabel umurParam adalah parameter, sedangkan variabel umur adalah properti.
    // Agar lebih praktis maka kita bisa samakan nama variabelnya dan gunakan kode this untuk membedakan kedudukannya. 
    // Seperti ini misalnya. 
  // }
  Hewan(int umur){
    this.umur = umur;
    // Kode this mereferensikan objek yang sedang digunakan. 
    // Pemanggilan this ada di dalam konstruktor kelas Hewan. 
    // Artinya nilai this mereferensikan objek Hewan. Kesimpulannya kode this.umur adalah akses ke atribut umur kelas Hewan dalam kelas Hewan.
  }


  void lari (){
    System.out.println("Berlari Dengan sangant cepat..");
  }
  
  void jalan(){
    System.out.println("Berjalan Dengan pelan..");
  }

  void makan(){
    System.out.println("Makan menggunakan mulut..");
  }
  // Jika Anda perhatikan, 3 metode di atas menggunakan void sebelum nama metodenya. 
  // Ini menandakan bahwa metode tersebut tidak memiliki nilai balik. 
  // Apa itu nilai balik? Nilai balik adalah nilai yang dikirim oleh suatu fungsi.

  double getBerat(){
    return berat;
  }

  double getTinggi(){
    return tinggi;
  }

  int getUmur(){
    return umur;
  }
  // Sekarang, mari kita coba invoke fungsi yang telah kita buat. 
  // Bukalah kelas Main dan tambahkan kode berikut:
  // System.out.println("Umurnya adalah " + kucing.getUmur());
  // double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
  // System.out.println("Indeks massa tubuhnya adalah " + bmi);
}
// Buatlah kelas baru dengan nama Main. Kemudian untuk meng-invoke ketiga metode di atas
