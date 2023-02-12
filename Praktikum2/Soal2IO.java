import java.util.Scanner;

/**
 * <b>Program menampilkan string dan integer dalam model 000</b>
 * @author Banteng Harisantoso
 * @version 1.00
 * @since 29 1 2023
 */

 public class Soal2IO{
    public static void main(String[] args){
        String[] bahasa = new String[3];
        int[] nilai = new int[3];

        //Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        //Scan

        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan bahasa dan nilai : ");
            String input = keyboard.nextLine();
            String[] splitInput = input.split(" ");
            bahasa[i] = splitInput[0];
            nilai[i] = Integer.parseInt(splitInput[1]);
        }
        keyboard.close();

        //Menampilkan hasil
        System.out.println("===================================");
        for(int i = 0; i < 3; i++){
            if(nilai[i]<10){
                System.out.printf("%-15s 00%d\n", bahasa[i], nilai[i]);
            }
            if(nilai[i]>=10 && nilai[i]<100){
                System.out.printf("%-15s 0%d\n", bahasa[i], nilai[i]);
            }
            if(nilai[i]>=100 && nilai[i]<1000){
                System.out.printf("%-15s %d\n", bahasa[i], nilai[i]);
            }
            
        }
        System.out.println("===================================");
        
    }
 }