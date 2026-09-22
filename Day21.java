import java.util.Scanner;
public class Sks{

  public static void main(String[] args) {
Scanner scan =new Scanner(System.in);

System.out.println("masukkan angka :");
    String a =scan.nextLine();
    byte b =Byte.parseByte(a);
    short c =Short.parseShort(a);
    int d =Integer.parseInt(a);
    double e =Double.parseDouble(a);
    float f =Float.parseFloat(a);
    char g =a.charAt(0);
    
    System.out.println("hasil byte = "+b);
    System.out.println("hasil short = "+c);
    System.out.println("hasil int = "+d);
    System.out.println("hasil double = "+e);
    System.out.println("hasil float = "+f);
    System.out.println("hasil char = "+g);
    
  }
}