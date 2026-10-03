import java.util.Scanner;
public class Day32{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
   System.out.println("enter angka 1"); int a =sc.nextInt();
  System.out.println("enter angka 2");int b =sc.nextInt();

    System.out.println("angka 1&2 sama ="+(a==b)+",angka 1>= angka 2 ="+(a>=b));
    System.out.println("angka 1>angka 2 ="+(a>b)+",angka 1 != angka b ="+(a!=b));
    System.out.println("angka 1<angka 2 ="+(a<b)+",angka 1 >10 ="+(a>10));
    System.out.println("angka 1>10 && angka 2<30 ="+(a>10 && b<30));
  }
}