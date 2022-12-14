package com.belajar.percabangan;

public class switch_java {
  public void switch1() {
    int input = 6;
    switch (input) {
      case 1:
        System.out.println("1");
        break;
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
      case 4:
        System.out.println("4");
        break;
      case 5:
        System.out.println("5");
        break;
      case 6:
        System.out.println("6");
      case 7:
        System.out.println("7");
        break;
      default:
        break;
      // Kode di atas berarti variabel input memiliki nilai integer 6. 
      // Ketika variabel input kita masukkan ke dalam switch maka program akan masuk case 6. 
      // Di dalam case 6, program akan menampilkan string “6”, kemudian pemanggilan break akan menghentikan proses switch.
      // Tidak berbeda jauh dengan if-then-else bukan? Lalu pertanyaannya, kenapa harus ada break? Bagaimana jika tidak ada break ?  
      // Sepertinya kita harus terlebih dahulu menelisik perbedaan dari if-then dan switch.
    }
  }
  public void switch_withoutBreak() {
    char input = 'C';
    int output = 0;

    switch (input) {
      case 'A':
        output++;
      case 'B':
        output++;
      case 'C':
        // program akan menjalankan kode didalam case ini
        output++; //output = 1
        // karena di akhir case C tidak ada break, maka program akan menjalankan case selanjutnya
      case 'D':
      // kode ini akan dijalankan program
        output++; // output = 2
      case 'E':
      //  kode ini akan dijalankan program
        output++; // output = 3
      default:
      // kode ini akan dijalankan program
        output++; // output = 4
    }
    System.out.println("Nilai akhirnya adalah :" + output);
    // Bagaimana bisa output yang dihasilkan 4? 
    // Case tanpa break akan menjalankan semua kode setelah case yang terpilih. 
    // Jadi dengan mengambil contoh kode di atas, dengan nilai inputan adalah char 'C', 
    // maka kode program akan masuk ke dalam case 'C'. 
    // Di dalamnya nilai variabel output akan ditambah dengan 1 karena pemanggilan operator ++. 
    // Dan karena tidak ada break maka program akan melanjutkan menjalankan case setelahnya yaitu case 'D', case 'E', dan default. 
    // Dan masing-masing di dalam case ada pemanggilan operator ++, sehingga nilai akhir dari output-nya adalah 4.

  }
  public static void main(String[] args) {
    switch_java mySwitch = new switch_java();

    mySwitch.switch1();
    mySwitch.switch_withoutBreak();
  }
}
