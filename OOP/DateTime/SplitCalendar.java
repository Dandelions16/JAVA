package com.DateTime;

import java.util.Calendar;

public class SplitCalendar {
  public static void main(String[] args) {
    
    // Menampilkan waktu sekarang
    Calendar calendar = Calendar.getInstance();

    System.out.println("Waktu sekarang adalah " + calendar.getTime());

    // Menampilakan secara sepesifik
    System.out.println("Tanggal :"  + calendar.get(Calendar.DATE));
    System.out.println("Bulan   :"  + calendar.get((Calendar.MONTH)));
    System.out.println("Tahhun  :"  + calendar.get((Calendar.YEAR)));
  }
}
