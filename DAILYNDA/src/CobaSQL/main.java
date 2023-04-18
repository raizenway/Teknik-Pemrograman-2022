package CobaSQL;

import java.sql.*;
import java.util.*;
import java.text.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;


public class main {

	public static void main(String[] args) throws SQLException, ParseException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "");
		Statement stmt = conn.createStatement();
		System.out.println("Connected");
		//stmt.executeQuery(sql); untuk select, dll
		ResultSet rs = stmt.executeQuery("SELECT * FROM mahasiswa"); //untuk update ubah, insert, dll
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnName(1) + "\t|" + rsmd.getColumnName(2));
		while(rs.next()) {
			System.out.println(rs.getString(1) + "\t|" + rs.getString(2));	
		}
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Masukkan Tanggal Kegiatan (dd-MM-yyyy) format:");
         String tgl = input.next();
         //convert string date values to java.util.Date class object
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
         java.util.Date utgl = sdf.parse(tgl); //util date class object
         Long ms = utgl.getTime();
         java.sql.Date sqtgl = new java.sql.Date(ms); //sql date class object
		
 	}

}
