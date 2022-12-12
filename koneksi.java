package program;
// class dan interface sql pada java
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// menyiapkan parameter JDBC
public class koneksi {
  static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/pemrograman";
  static final String User = "root";
  static final String pass = "";
  // menyiapkan objek yang dibutuhka untuk mengelolal database
  static Connection conn;
  static Statement stmt;
  static ResultSet rs;

  public static void main(String []args) {
      // melakukan koneksi ke database
      // dibungkus dengan try catch
      try{
        // register driver yang akan digunakan
        Class.forName(JDBC_DRIVER);
        // buat koneksi ke database
        conn = DriverManager.getConnection(DB_URL, User, pass);
        // buat objek Statement
        stmt = conn.createStatement();
        // buat query ke database
        String sql = "SELECT*FROM siswa";
        // eksekusi query dan simpan hasilnya di obj resultset
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
          System.out.println("ID siswa:" + rs.getInt("id_siswa"));
          System.out.println("NIM siswa:" + rs.getString("nim"));
          System.out.println("Nama Siswa:" + rs.getString("nama"));
          System.out.println("Jenis Kelamin :" + rs.getString("jenkel"));
          System.out.println("Kota Tinggal : " + rs.getString("kota"));
          System.out.println("No hp :" + rs.getString("nohp"));
          System.out.println("Nilai Siswa :" + rs.getInt("nilai"));
        }
      }catch(Exception e){
        e.printStackTrace();
      } 
  }
}