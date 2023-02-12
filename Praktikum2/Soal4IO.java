import java.util.Scanner;

/**
 * <b>Gaji Agent</b><br>
 * Program untuk menghitung gaji yang didapat agent
 * berdasarkan hasil penjualan
 * @author Banteng Harisantoso
 * @version 1.0
 * @since 29 1 2023
 */

 public class Soal4IO{
    public static void main(String[] args){
        //KAMUS DATA
        int penjualan;
        int gaji = 500000;
        int harga = 50000;
        int bonus, denda;

        //MEMBUAT SCANNER
        Scanner input = new Scanner(System.in);

        //SCAN PENJUALAN
        System.out.println("Berapa total penjualan anda?");
        penjualan = input.nextInt();

        //KALKULASI BONUS GAJI
        gaji = (penjualan >= 40) ? gaji + (((harga * 25)/100)*penjualan) : (penjualan > 80) ? gaji + (((harga * 35)/100)*penjualan) : (penjualan < 15) ? gaji - (((15 - penjualan)* harga) * 15 / 100) : gaji + (((harga * 10)/100) * penjualan);
        System.out.println("Gaji anda bulan ini adalah\nRp. "+gaji);

    }
 }