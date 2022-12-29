package com.Implementasi;

import java.util.Scanner;

// IMPLEMENTASI  IF

public class SuhuAir {
  // Contoh pemakaian if tiga kasus : wujud air
  public static void main(String[] args) {
    // kamus
    int T;
    Scanner scanner = new Scanner(System.in);
    //  program

    System.out.println("Contoh if tiga kasus ");
    System.out.println("Suhu (der.C) =  ");
    
    // Scanner untuk memasukkan suhu air
    
    T = scanner.nextInt(); // memasukkan suhu air

    // Proses pengecekkan dengan if
    if (T < 0) {
      System.out.println("Wujud air beku "  + T);
    }else if(( 0 < T  ) && (T <= 100 )){
      System.out.println("Wujud air cair "  + T);

    }else if (T>100){
      System.out.println("Wujud cair uap/gas" + T);
    }
  }
}
