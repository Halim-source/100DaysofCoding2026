import java.util.Scanner;
public class Day57{
  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);

    System.out.print("masukkan angka N =");
    int n =sc.nextInt();
    int a =1;
    int m =n;

    System.out.print("cetak angka genap dari "+n+"-1\n");
    while(n>=a){
      if (n%2==0){
      System.out.print(n+" ");
      }n--;
      
    }System.out.println("");
    System.out.print("cetak angka ganjil dari "+m+"-1\n");
    while(m>=a){
      if (m%2!=0){
      System.out.print(m+" ");  
    }m--;
    }   
  }
}