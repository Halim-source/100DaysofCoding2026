import java.util.Scanner;
public class Day56{
  public static void main(String[]args){

    Scanner sc =new Scanner(System.in);

    System.out.print("masukkan angka n  =");
    int n =sc.nextInt();

    int a =1;
    System.out.println("cetak angka 1-"+n);

    while(a<=n) {
      
     System.out.print(a+" ");a++;
    }
    System.out.println();
    System.out.println("cetak angka "+n+"-1");
    
     while(n>=1){
       
       System.out.print(n+" ");n--;
     }
    
  }
}