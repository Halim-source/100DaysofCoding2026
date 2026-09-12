import java.util.Scanner;

public class Day11{

  public static void main(String[] args) {

    Scanner scan1 = new Scanner(System.in);

 System.out.println("masukkan nama anda");
    String nama =scan1.next();
 System.out.println("masukkan umur anda");
    int umur =scan1.nextInt();
 System.out.println("masukkan tinggi badan anda");
    Double tinggi =scan1.nextDouble();
    
    //output
    System.out.printf("nama saya %s,umur saya %d tahun,tinggi saya %.2f cm", nama, umur, tinggi);
    
  
  }
}