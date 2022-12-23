package com.OOP.AccesModifier.package2;

import com.OOP.AccesModifier.package1.KelasA;

public class Main {
  public static void main(String[] args) {
    // kode ini pasti akan mengalami eror

    KelasA kelasA = new KelasA();

    // System.out.println(kelasA.functionB());
    // System.out.println(KelasA.memberB);
    // System.out.println(kelasA.memberC);

    // Jika diperhatikan kode berikut pasti akan eror:
    // The method functionB() from the type KelasA is not visible
    // The field KelasA.memberB is not visible
    // The field KelasA.memberC is not visible
    // Ini terjadi karena functionB, memberB dan memberC tidak dalam keadaan public. 
    // Anda bisa beri komentar untuk ketiga kode tersebut menjadi seperti ini:
    // // System.out.println(kelasA.functionB());
    // // System.out.println(KelasA.memberB);
    // // System.out.println(kelasA.memberC);

    // Protected
    // Access modifier protected bisa diakses selama masih dalam satu package. 
    // Protected memiliki sedikit perbedaan dengan default modifier. 
    // Perbedaannya adalah protected bisa diakses dari luar package.
    // Akan tetapi, satu-satunya cara untuk akses dari luar package adalah kelas yang hendak mengakses, merupakan kelas turunannya.

    // Codelab Protected
    // Kita tambahkan access modifier public terlebih dahulu pada KelasA agar bisa di akses dari luar package.
    // Kita juga menambahkan metode baru methodC dengan modifiernya sebagai protected.
    // 1.) Bukalah kembali proyek AccessModifier.
    // 2.) Tambahkan methodC di dalam kelas kelasA

    KelasB kelasB = new KelasB();
    kelasB.methodC();
  }
}
