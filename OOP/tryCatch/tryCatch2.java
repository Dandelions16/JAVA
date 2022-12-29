package com.tryCatch;

// try cath menggunakan finaly
public class tryCatch2 {
  public static void main(String[] args) {
    int [] a =new int[5];
    try {
      System.out.println("Akses elemen array ke 5 " + a[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO: handle exception
      System.out.println("Exception trohwn :" + e);
    }finally{
      a [4] =10;
      System.out.println("Nilai terakhir :" + a[4]);
    }
    // Contoh program di atas adalah contoh akses elemen array yang melebihi dari jumlah indeks array-nya.
    // Program akan masuk ke block catch, kemudian akan menjalankan kode yang ada di block finally, 
    // yaitu mengisi nilai indeks ke-4 array dengan 10.
  }
}
