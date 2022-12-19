package com.belajar.perulangan;

public class perulangan {
  public void for1(){
    // Kita membuat variabel dengan tipe data integer yang kita sebut sebagai initialization. 
    // Dalam hal ini kita menginisialisasi angka dimulai d
    for (int i = 1; i <= 10; i++) {
      System.out.println("Angka : " + i);
  }
  // Pada tahap ini kita menentukan batasan nilai akhir suatu perulangan atau disebut dengan termination. 
  // Contoh di atas adalah angka lebih kecil atau sama dengan 10.
  // i<=10;

  // Kita menentukan aksi terhadap perulangan, aksi tersebut bisa menaikkan (increment) atau menurunkan (decrement). 
  //  Apabila kita ingin melakukan aksi increment maka nilai awal (initialization) harus lebih kecil daripada nilai akhir (termination). Begitupun sebaliknya, 
  // jika melakukan aksi menurun maka nilai awal (initialization) harus lebih besar daripada nilai akhir (termination). 
  // Seperti contoh di atas kita melakukan aksi increment.

  // i++;
  }
  public void for2_Bersarang(){
    int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    // Inilah yang disebut dengan perulangan for bersarang. Perulangan ke pertama akan mempengaruhi perulangan kedua, 
    // begitu juga ketika ada perulangan ketiga, keempat dan seterusnya, maka akan dipengaruhi oleh perulangan sebelumnya
  }
  public void while_perulangan(){
    // Kita mendeklarasikan variabel nilai dengan angka 1.
    int value = 1;
    // Pengecekan suatu kondisi pada variabel. Apabila nilai lebih kecil atau sama dengan 10.
    while (value <= 10) {
      // Melakukan sebuah perintah apabila kondisi terpenuhi.
        System.out.print("Angka : " + value);
        value++;
        System.out.print("\n");
    }
  }
  public void do_while(){
    // Kita mendeklarasikan variabel nilai dengan angka 1
    int value = 1;
        do {
          // Melakukan sebuah perintah terlebih dahulu.
            System.out.println("Angka : " + value);
            value++;
          // Pengecekan suatu kondisi terhadap variabel. Apabila terpenuhi maka perintah dilanjutkan
        } while (value <= 10);
  }
  public static void main(String[] args) {
    perulangan myObj= new perulangan();

    myObj.for1();
    myObj.for2_Bersarang();
    myObj.while_perulangan();
    myObj.do_while();
  }
} 