
import java.util.Scanner;

/**
 * <b>Big Number</b><br>
 * Program untuk menjumlah dan mengalikan
 * @author Banteng Harisantoso
 * @version 1.0
 * @since 30 1 2023
 */

public class Soal6IO{
    public static void main(String[] args){
        //Kamus Data
        int bilangan1, bilangan2;
        int jumlah;
        int kali;

        //Scanner baru
        Scanner keyboard = new Scanner(System.in);

        //Input
        System.out.println("Silahkan masukkan angka pertama :");
        bilangan1 = keyboard.nextInt();
        System.out.println("Silahkan masukkan angka kedua :");
        bilangan2 = keyboard.nextInt();
        jumlah = bilangan1 + bilangan2;
        kali = bilangan1 * bilangan2;
        System.out.println(jumlah);
        System.out.println(kali);

    }
}