package com.OOP;

public class Constructor {
  // Constructor
  // Constructor adalah method yang secara default sudah terbentuk ketika kelas
  // dibuat.
  // Ketika suatu kelas dibuat (instansiasi) maka konstruktor akan terpanggil
  // juga.
  // Constructor harus memiliki nama yang sama dengan nama kelasnya. Lalu apa
  // kegunaan Constructor?
  // Memberikan nilai awal terhadap suatu data atau obyek
  // Mengalokasikan ruang sebuah kelas dalam obyek

  // Terdapat dua tipe cunstructor pada java:

  // 1.)No-argument constructor, apabila kita tidak mendeklarasikan konstruktor
  // dalam suatu kelas,
  // kompiler Java akan membuat default constructor(tanpa parameter) dan pada body
  // constructor tersebut kosong.
  // Sementara jika kita mendeklarasikan konstruktor tanpa parameter , baik
  // menuliskan kode pada body-nya atau tidak, maka itu bukan default constructor.
  // Itu adalah no-argument constructor.
  // Berikut ini adalah contoh no-argument constructorpada suatu kelas.
  // ini adalah contoh no-argument constructor
  public void KucingAnggora() {

  }
  // =====================================================================================
  // Parameterized constructor, konstruktor yang memiliki parameter untuk
  // menginisiasi atau memberikan nilai awal data dengan nilai yang kita tentukan.
  // Berikut ini adalah contoh parameterized constructor pada suatu kelas.
  String namaKucing;
  int beratBadan;

  // ini adalah contoh parameterized constructor
  // dengan memberikan nilai awal data member nama_kucing dan berat_badan
  // dengan parameter yang kita tentukan
  public void KucingAnggora(String nama, int berat) {
    namaKucing = nama;
    beratBadan = berat;
  }
}
