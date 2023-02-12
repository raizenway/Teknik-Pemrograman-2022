import java.util.Scanner;

/**
 * <b>Buka Tutup Jalan</b><br>
 * Program untuk menentukan mobil harus berhenti atau berjalan
 * @author Banteng Harisantoso
 * @version 1.0
 * @since 30 1 2023
 */

public class Soal5IO{
    public static void main(String[] args){
        //Kamus Data
        int[] plat = new int[4];
        int jumlah = 0;
        int s;

        //Scanner baru
        Scanner keyboard = new Scanner(System.in);

        //Input
        System.out.println("Silahkan masukkan 4 plat nomor");
        for(int i = 0; i<4; i++){
            plat[i] = keyboard.nextInt();
            jumlah = jumlah + plat[i];
        }
        s = jumlah % 5;
        if(s == 0){
            System.out.println("jalan");
        }
        else{
            System.out.println("berhenti");
        }

    }
}