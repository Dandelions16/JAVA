package com.OOP.AccesModifier.package2;

import com.OOP.AccesModifier.package1.KelasA;

public class KelasB extends KelasA {
  
  @Override
  protected void methodC(){
    super.methodC();

    System.out.println("Contoh pemanggilan protected dari package luar");
  }
  // Kode di atas adalah contoh kelas turunan yang bisa mengakses metode dengan modifier protected dari induknya.
  // Selanjutnya Bukalah Main di package2 dan tambahkan kode:
}
