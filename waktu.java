package com.belajar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

// import library commons-lang3-3.9.jar atau belum ada  librarnya download terlebih dahulu
// https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar
public class belajar_package {
  public static void main(String[]args) {
    Date today = new Date();
    
    System.out.println("hari ini :" + today);
    Date tomorrow = DateUtils.addDays(today, 1);
    System.out.println("Besok :" + tomorrow);
  }
}
