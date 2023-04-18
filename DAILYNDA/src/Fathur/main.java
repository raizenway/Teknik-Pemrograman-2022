package Fathur;

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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.mysql.cj.util.Util;

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
		
		//Add date
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Tanggal Kegiatan (HH-BB-TTTT):");
		String dateStr = input.next();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(dateStr, dateFormatter);

		//Add time
		System.out.println("Masukkan Jam Kegiatan (JJ:MM:DD):");
		String timeStr = input.next();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.parse(timeStr, timeFormatter);

		//Merge date and time
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		//Insert data into database
		String sql = "INSERT INTO mahasiswa (tanggal_kegiatan, Nama) VALUES (?, ?)";
		String lmao = "Makan";
		PreparedStatement prstmt = conn.prepareStatement(sql);
		prstmt.setObject(1, dateTime);
		prstmt.setString(2, lmao);
		prstmt.executeUpdate();

		System.out.println("Table sudah di updpate");
		
		System.out.println(dateTime);

		
 	}

}
