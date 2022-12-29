package com.Implementasi.BangunDatar;

import java.util.Scanner;

public class Main {

  private static char pilihan;
  private static Scanner scanner = new Scanner(System.in);

  private static void mainMenu() {
    // Pilihan Menu
    System.out.println("=========================");
    System.out.println("Hitung Luas dan Keliling");
    System.out.println("1. Persegi Panjang");
    System.out.println("2. Segitiga Siku Siku");
    System.out.println("3. Lingkaran");
    System.out.println("Masukkan Pilihan Menu =");
    pilihan = scanner.next().charAt(0);
  }

  public static void main(String[] args) {

    // Kamus
    PersegiPanjang oPersegiPanjang;
    SegitigaSiku oSegitigaSiku;
    Lingkaran oLingkaran;

    int s1, s2, r;

    oPersegiPanjang = new PersegiPanjang();
    oSegitigaSiku = new SegitigaSiku();
    oLingkaran = new Lingkaran();

    /* Program */
    // Panggil metode
    mainMenu();

    // konditional untuk pilihan menu dimasukkan

    switch (pilihan) {
      case '1':
        // Memasukkan nilai luas dan keliling
        System.out.println("Masukkan panjang persegi =");
        s1 = scanner.nextInt();
        System.out.println("Masukkan lebar persegi   =");
        s2 = scanner.nextInt();

        // Mencetak Hasil
        System.out.println("Luas persegi panjang  = " + oPersegiPanjang.luas(s1, s2));
        System.out.println("Keliling persegi panjang = " + oPersegiPanjang.keliling(s1, s2));
        break;

      case '2':
        // Memasukkan nilai alas dan tinggi
        System.out.println("Masukkan alas segitiga siku-siku=");
        s1 = scanner.nextInt();
        System.out.println("Masukkan tinggi siku-siku       =");
        s2 = scanner.nextInt();

        // Mencetak hasil
        System.out.println("Luas segitiga siku-siku          = " + oSegitigaSiku.luas(s1, s2));
        System.out.println("Keliling segitiga siku-siku      = " + oSegitigaSiku.keliling(s1, s2));
        break;

      case '3':
        // Memasukkan jari jari
        System.out.println("Masukkan jari-jari    =");
        r = scanner.nextInt();

        // Mencetak hasil
        System.out.println("Luas lingkaran  = " + oLingkaran.luas(r));
        System.out.println("Keliling lingkaran  = " + oLingkaran.keliling(r));
        break;

      default: {
        System.out.println("Tidak ada pilihan ");
        break;
      }
    }
  }
}
