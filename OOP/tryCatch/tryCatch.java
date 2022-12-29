package com.tryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryCatch {
  public static void main(String[] args) {
    // Tentukan path ke file yang akan dibaca
    String filePath = "membaca file.txt";

    // Baca file menggunakan kelas FileReader dan BufferedReader
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
      // Kode di atas merupakan contoh implementasi looping (perulangan) yang digunakan untuk membaca file baris demi baris.
      // Pertama, variabel bernama "line" dengan tipe data String dideklarasikan. 
      // Kemudian, looping while dimulai dengan kondisi (line = br.readLine()) != null, 
      // yang artinya looping akan terus berjalan selama nilai yang dikembalikan oleh method readLine() 
      // dari objek BufferedReader (br) tidak sama dengan null. Method readLine() akan mengembalikan nilai null jika tidak ada baris lain yang dapat dibaca dari file.
      // Di dalam looping, baris yang sedang dibaca akan dicetak ke console menggunakan statement System.out.println(line). 
      // Setiap iterasi looping, method readLine() akan dipanggil lagi untuk membaca baris berikutnya dari file. 
      // Looping akan berakhir jika tidak ada baris lain yang dapat dibaca, yaitu saat method readLine() mengembalikan nilai null.
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

