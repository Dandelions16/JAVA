package com.StreamIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
  public static void main(String[] args) {
    FileReader in = null;
    FileWriter out = null;
    try {
        in = new FileReader("latihan_input.txt");
        out = new FileWriter("latihan_ouput.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        // perulangan while dimulai dengan kondisi (c = in.read()) != -1. 
        // Method read() dari kelas FileReader akan mengembalikan nilai -1 jika tidak ada karakter lain yang dapat dibaca dari file.
        // Sehingga perulangan akan terus berjalan selama masih ada karakter yang dapat dibaca dari file "latihan_input.txt".
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
