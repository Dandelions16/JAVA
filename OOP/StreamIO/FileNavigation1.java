package com.StreamIO;

import java.io.File;

// latihan 1

public class FileNavigation1 {
  public static void main(String[] args) {
    String dirname = "/java/latihan1";
    File file = new File(dirname);
    // Buat directory
    file.mkdirs();
  }
  // Karena menggunakan mkdirs, kode di atas akan membuat directory latihan1 dan parent directory java.
}
