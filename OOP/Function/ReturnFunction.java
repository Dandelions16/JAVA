package com.OOP.Function;

public class ReturnFunction {
  public static void main(String[] args) {
    double p = 7;
    double l = 6.5;
    double hasil = hitungLuas(p, l); // Memanggil Fungsi
    System.out.println("Hasilnya adalah = " + hasil);

  }

  // contoh function dengan nilai balik
  public static double hitungLuas(double panjang, double lebar) {
    double luas = panjang * lebar;
    return luas;
  }
  // Catatan : Penamaan suatu fungsi dapat disesuaikan sesuai kebutuhan.
  // Namun, secara umum penamaan sebuah fungsi diawali dengan huruf kecil dan
  // diikuti dengan huruf besar setelahnya.
  // Hal ini biasa disebut dengan notasi ”punuk unta (camelCase)” seperti contoh:
  // luas
  // hitungKeliling
  // hapusUser
  // rataNilaiMahasiswa
  // jumlahKomentarNetizen
  // jumlahLaguYoungLex
}