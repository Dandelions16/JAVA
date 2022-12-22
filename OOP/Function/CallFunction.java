package com.OOP.Function;

// Cara mendeklarasikan Fungsi
// modifier returnType nameOfFunction(parameters) {
    // isi 
// }

// modifier menunjukkan sifat yang dimiliki pada suatu fungsi seperti public, private, protected.
// returnType merupakan nilai balik yang diberikan oleh fungsi. Apabila fungsi tidak memiliki nilai balik maka menggunakan void.
// nameOfFunction adalah nama dari sebuah fungsi.
// parameters bersifat opsional, Suatu fungsi dapat mempunyai banyak parameters atau pun tidak sama sekali.

public class CallFunction {
  public static void main(String[] args) {
    // memanggil fungsi
    cobaFungsi();
    
  }
  public static void cobaFungsi() {
    System.out.println("Ini Merupakan bagian dari Fungsi");
  }
  // contoh function dengan nilai balik
  public static double hitungLuas(double panjang, double lebar) {
    double luas = panjang * lebar;
    return luas;
  }
  // Catatan : Penamaan suatu fungsi dapat disesuaikan sesuai kebutuhan. 
  // Namun, secara umum penamaan sebuah fungsi diawali dengan huruf kecil dan diikuti dengan huruf besar setelahnya. 
  // Hal ini biasa disebut dengan notasi ”punuk unta (camelCase)” seperti contoh:
  // luas
  // hitungKeliling
  // hapusUser
  // rataNilaiMahasiswa
  // jumlahKomentarNetizen
  // jumlahLaguYoungLex
}
