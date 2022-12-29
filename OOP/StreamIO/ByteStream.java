package com.StreamIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
  public static void main(String[] args) {
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream("Latihan_input.txt");
      out = new FileOutputStream("Latihan_output.txt");
      int c;

      while ((c = in.read()) != -1) {
        out.write(c);
      }
        // perulangan while dimulai dengan kondisi (c = in.read()) != -1. 
        // Method read() dari kelas FileReader akan mengembalikan nilai -1 jika tidak ada karakter lain yang dapat dibaca dari file.
        // Sehingga perulangan akan terus berjalan selama masih ada karakter yang dapat dibaca dari file "latihan_input.txt".
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    } finally {
      try {
        if (in != null) {
          in.close();
        }
        if (out != null) {
          out.close();
        }
      } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
      }
      // Di dalam block finally kita tidak boleh lupa untuk menutup stream.
      // Lupa untuk menutup stream akan menyebabkan kebocoran pada resource (resource leaks).
    }
  }
}
