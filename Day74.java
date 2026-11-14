import java.util.Scanner;

public class Day74{
  public static void main(String[]args){

Scanner sc =new Scanner(System.in);
    System.out.print("masukkan teks :");
    String teks=sc.nextLine();

    System.out.println("jumlah huruf     :"+teks.length());
    System.out.println("versi huruf besar:"+teks.toUpperCase());
    System.out.println("versi huruf kecil:"+teks.toLowerCase());

sc.close();
    
  }
}