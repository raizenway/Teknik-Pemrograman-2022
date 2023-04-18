package Fathur;

//import bumbu-bumbu yang diperlukan

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.sql.ResultSet;


//bisa juga diimpor sekaligus seperti ini:
//import java.sql.*


public class BelajarJavaMysql {
 
 // Menyiapkan paramter JDBC untuk koneksi ke datbase
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
 static final String DB_URL = "jdbc:mysql://localhost/3306";
 static final String USER = "root";
 static final String PASS = "";

 // Menyiapkan objek yang diperlukan untuk mengelola database
 static Connection conn;
 static Statement stmt;
 static ResultSet rs;

 public static void main(String[] args) {
     
     // Melakukan koneksi ke database
     // harus dibungkus dalam blok try/catch
     try {
     	// register driver yang akan dipakai
         Class.forName(JDBC_DRIVER);
         // buat koneksi ke database
         conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    // buat objek statement
         stmt = conn.createStatement();
     	Scanner input = new Scanner(System.in);
     	boolean loop = true;
     	while (loop) {
				System.out.println("=============== DAILYNDA ===============");
				System.out.println("1. Read Database");
				System.out.println("2. Add New Data");
				System.out.println("3. Update Data");
				System.out.println("4. Delete Data");
				System.out.print("Pilihan : "); int pil = input.nextInt();
				switch (pil) {
				case 1:
					String sql = "SELECT * FROM kegiatan";
		            // eksekusi query dan simpan hasilnya di obj ResultSet
		            rs = stmt.executeQuery(sql);
					while(rs.next()){
		                System.out.print(rs.getInt("idKegiatan"));
		                System.out.print( "\t" + rs.getString("namaKegiatan"));
		                System.out.println("\t" + rs.getString("tanggal"));
		            }
				break;
				case 2:
					System.out.print("Nama Kegiatan Baru : ");
					String keg = input.next();
		            String CREATE = "INSERT INTO kegiatan (namaKegiatan) VALUE('" + keg + "')";
		            stmt.execute(CREATE);
					break;
				case 3:
					String read = "SELECT * FROM kegiatan";
		            // eksekusi query dan simpan hasilnya di obj ResultSet
		            rs = stmt.executeQuery(read);
					while(rs.next()){
		                System.out.print(rs.getInt("idKegiatan"));
		                System.out.print( "\t" + rs.getString("namaKegiatan"));
		                System.out.println("\t" + rs.getString("tanggal"));
		            }
					System.out.print("Masukkan ID Kegiatan yang Ingin diubah : ");int id = input.nextInt();
					System.out.print("Masukkan Kegiatan baru : ");String newKegiatan = input.next();
		            String UPDATE = "UPDATE kegiatan SET namaKegiatan= '" + newKegiatan + "' WHERE idKegiatan =" + id;
		            stmt.execute(UPDATE);
					break;
				case 4:
					String READ = "SELECT * FROM kegiatan";
		            // eksekusi query dan simpan hasilnya di obj ResultSet
		            rs = stmt.executeQuery(READ);
					while(rs.next()){
		                System.out.print(rs.getInt("idKegiatan"));
		                System.out.print( "\t" + rs.getString("namaKegiatan"));
		                System.out.println("\t" + rs.getString("tanggal"));
		            }
					System.out.print("Masukkan ID Kegiatan yang Ingin dihapus : ");int ids = input.nextInt();
					String DELETE = "DELETE FROM kegiatan WHERE idKegiatan = " + ids;
					stmt.execute(DELETE);
				}
				
				
			}
         
         
         // buat query ke database
         
         
         // tampilkan hasil query
         
         stmt.close();
         conn.close();
         
     } catch (Exception e) {
         e.printStackTrace();
     }

 }
 
}