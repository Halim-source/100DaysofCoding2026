import java.util.Scanner;
public class Day60{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Masukkan angka N =");
    int N =sc.nextInt();
    int a =1;
    int total =0;
    while(a<=N){
    System.out.print(a+" ");
      total +=a;
      a++;
      
    }
      System.out.println("\ntotal penjumlahan dari angka 1-"+N+"="+total);
    
  }
}