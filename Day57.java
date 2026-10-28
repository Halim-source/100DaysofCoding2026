import java.util.Scanner;
public class Day57{
  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);

    System.out.print("masukkan angka N =");
    int n =sc.nextInt();
    int a =1;

    System.out.print("cetak angka genap dari 1-"+n+"\n");
    while(a<=n){
      if (a%2==0){
      System.out.print(a+" ");
      }a++;
      
    }
      System.out.println("");
    System.out.print("cetak angka ganjil dari 1-"+n+"\n");
    a =1;
    while(a<=n){
      if (a%2==1){
      System.out.print(a+" ");  
    }a++;
    }   
  }
}