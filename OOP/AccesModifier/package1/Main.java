package com.OOP.AccesModifier.package1;

public class Main {
  public static void main(String[] args) {
    KelasA kelasA = new KelasA();

    // System.out.println(KelasA.memberA);
    // System.out.println(kelasA.functionA());
    System.out.println(kelasA.functionB());
    System.out.println(KelasA.memberB);
    System.out.println(KelasA.memberC);
    // jika diperhatikan, kode diatas akan terjadi eror karena memberA dan functionA dalam keadaan private, 
    // hal tersebut mengatikbatkan tidak bisa diakses dari luar kelas.
    // Maka ubahlah kode dikelas Main menjadi seperti ini:
    // System.out.println(kelasA.functionB());
  }
}
