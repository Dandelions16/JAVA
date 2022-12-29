package com.DateTime;

public class TimeMillis {
  public static void main(String[] args) {
    long timeNow =  System.currentTimeMillis();
    
    System.out.println("Waktu sekarang adalah " + timeNow + " millisecond");

    // Melalui perintah System.currentTimeMillis();, saat kode diatas dieksekusi,  
    // maka waktu yang didapat saat itu disimpan pada variable timeNow yang bertipe data long. 
  }
}
