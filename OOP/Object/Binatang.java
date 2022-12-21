package com.OOP.Object;

// Tahap selanjutnya kita akan mencoba membuat objek pada sebuah kelas yang lebih kompleks.
// Selanjutnya kita akan coba menggunakan objek yang ada di kelas Binatang.
public class Binatang {
  String nama;
    int berat;
    int jumlahkaki;

    // Ini merupakan kunstruktor dari kelas Binatang. Konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Binatang(String namaBinatang){
      nama = namaBinatang;
    }

    public void beratBinatang(int beratBinatang){
      berat = beratBinatang;
    }

    public void jumlahkakiBinatang(int jumlahkakiBinatang){
      jumlahkaki = jumlahkakiBinatang;
    }
    public void cetakBinatang(){
      System.out.println("Nama hewan  :" + nama);
      System.out.println("Berat hewan :" +berat+"kg");
      System.out.println("Jumlah kaki :"+jumlahkaki);
    }
  // Kelas Binatang memliki beberapa atribut, seperti nama, berat dan jumlah kaki. 
  // Masing-masing dari atribut tersebut kita berikan parameter dengan membuat method.
  // ok saatnya kita mengeksekusi kodenya buatlah class main1 di package com.oop.object
}
