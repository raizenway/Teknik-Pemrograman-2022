import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** <b>Token of String Counter</b><br>
 *  Program untuk menghitung berapa banyak token dari string
 *  @author Banteng Harisantoso
 *  @version 1.0
 *  @since 29-01-2003
 */

public class Soal1IO{
    public static void main(String[] args){
        String kalimat;
        int token = 0;

        //Menampilkan perintah input
        System.out.println("Silahkan masukkan kalimat : ");
        //Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        //Scan
        kalimat = keyboard.nextLine();
        keyboard.close();

        //Menyiapkan pattern dengan nilai A-Z atau a-z
        Pattern pattern = Pattern.compile("[A-Za-z]+");

        //Membuat objek pembanding
        Matcher match = pattern.matcher(kalimat);

        //Menghitung berapa banyak token
        
        while(match.find()){
            token=token+1;
        }
        
        //Menampilkan jumlah token
        System.out.println(token);
        
        //Menampilkan token
        match.reset(); //Mereset token
        while(match.find()){
            System.out.println(match.group());
        }
    }
}