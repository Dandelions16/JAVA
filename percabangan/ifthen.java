package com.belajar.percabangan;

public class ifthen {
  public void ifThen() {
    boolean isOn = true;

    if (isOn) {
      System.out.println("menyalakan Lampu");
    } else {
      System.out.println("Kondisi tidak terpenuhi");
    }
    // Kode di atas berarti ketika nilai isOn adalah true maka obyek lampu akan
    // memanggil metode nyala().
    // Ini adalah contoh penggunaan percabangan yang sangat simpel, di mana ketika
    // suatu kondisi nilainya true
    // maka kode yang ada di dalam {} (braces) akan bisa dijalankan.
    // Penggunaan braces adalah optional ketika kode yang dijalankan hanyalah 1
    // baris.
    // Akan tetapi jika terdapat lebih dari 1 baris, maka kode yang di dalamnya
    // harus ada dalam {}

    // Kode di atas berarti ketika nilai isOn bernilai false maka baris kode yang
    // ada di dalam else akan dijalankan.
    // Di sini else berfungsi sebagai secondary option di mana ketika opsi pertama
    // if gagal, maka opsi kedua else dijalankan.
    // Sebenarnya else bukan hanya sebagai secondary option saja.
    // Else lebih cocok dikatakan sebagai last option (opsi terakhir)
  } 

  public void ifThen2() {
    int nilaiUjian = 80;
    char indeksPrestasi;
    if (nilaiUjian >= 90) {
      indeksPrestasi = 'A';
    } else if (nilaiUjian >= 80) {
      indeksPrestasi = 'B';
    } else if (nilaiUjian >= 70) {
      indeksPrestasi = 'C';
    } else if (nilaiUjian >= 60) {
      indeksPrestasi = 'D';
    } else if (nilaiUjian >= 50) {
      indeksPrestasi = 'E';
    } else {
      indeksPrestasi = 'F';
    }
    System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
    // Kode di atas memiliki beberapa cabang kode yang bisa dijalankan. 
    // Tergantung dari nilai variabel integer nilaiUjian, kode yang dijalankan akan mengikuti nilainya. 
    // Di atas atau sama dengan 90 maka indeks prestasi adalah 'A'; di atas 80 maka 'B'; di atas 70 maka 'C'; di atas 60 maka 'D'; di atas 50 maka 'E'; terakhir di bawah 50 maka indeks prestasinya adalah 'F'.
    // Bisa disimpulkan bahwa else merupakan pilihan terakhir. 
    // Ketika if dan semua else-if nilainya adalah false maka kode di dalam else yang akan dijalankan.
  }
   public static void main(String[] args) {
    ifthen myObj = new ifthen();
    myObj.ifThen();
    myObj.ifThen2();
   }
}
