package com.DateTime;

import java.util.Date;

public class DateTime {
  public static void main(String[] args) {
    Date  date = new Date();
    
    System.out.println("Sekarang adalah " + date.toString());

    // Untuk menghasilkan tanggal dan waktu sekarang java.util.Date kita perlu lakukan inisialisasi lalu panggil dengan method date.
    // toString() untuk menampilkan hasil tanggal sekarang setelah dijalankan programnya.
  }
}
