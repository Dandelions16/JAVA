package com.OOP.Object;

public class Main {
  public static void main(String[] args) {
    Hewan objekHewan = new Hewan();
    objekHewan.cetakNama("Elang");
  }
}
// Bedah code
// Pada kode di atas kita mempunyai sebuah kelas bernama Hewan. 
// Di dalam class tersebut kita mempunyai metode cetakNama yang mempunyai parameter nama. 
// Pada metode cetakNama kita hanya melakukan perintah menampilkan berdasarkan parameter yang dikirim 
// dengan menggunakan tipe data String.

// public void cetakNama(String nama) {
//   System.out.println("Nama hewan: " + nama);
// }

// Pada kode selanjutnya kita menciptakan suatu objek dengan perintah new. 

// Sedangkan objekHewan merupakan nama dari objek yang kita buat.
// Hewan objekHewan = new Hewan();

// Untuk memanggil sebuah metode di dalam suatu kelas, kita dapat menggunakan (.) (titik).
// objekNama.cetakNama("Elang");