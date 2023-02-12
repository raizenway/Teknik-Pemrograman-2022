import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSoal1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.close();
    
    Pattern p = Pattern.compile("[A-Za-z]+");
    Matcher m = p.matcher(s);
    
    int count = 0;
    while (m.find()) {
      count++;
    }
    
    System.out.println(count);
    m.reset();
    while (m.find()) {
      System.out.println(m.group());
    }
  }
}
