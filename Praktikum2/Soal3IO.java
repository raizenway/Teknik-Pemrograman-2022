import java.util.Scanner;

/**
 * 
 * @author Banteng Harisantoso
 * @version 1.00
 * @since 29 1 2023
 */

 public class Soal3IO{
    public static void main(String[] args){
        //KAMUS DATA
        int[] angka = new int[2];
        char operator;
        int hasil;

        //MEMBUAT SCANNER
        Scanner input = new Scanner(System.in);

        //Input
        System.out.println("Masukkan operasi (A 'operasi' B) :");
        angka[0] = input.nextInt();
        operator = input.next().charAt(0);
        angka[1] = input.nextInt();
        input.close();
        
        switch (operator) {
            case '+': hasil = angka[0]+angka[1];
                
                break;
            case '-': hasil = angka[0]-angka[1];
                
                break;
            case '*': hasil = angka[0]*angka[1];
                
                break;
            case '/': hasil = angka[0]/angka[1];
                
                break;
            case '%': hasil = angka[0]%angka[1];
                
                break;
            default : hasil = 0;
                break;
        }

       

        System.out.println(hasil);

    }
 }