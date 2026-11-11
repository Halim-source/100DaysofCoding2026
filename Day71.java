import java.util.Scanner;
public class Day71{
  public static void main(String[]args){
Scanner sc = new Scanner(System.in);

    System.out.print("masukkan tinggi segitiga =");
      int a =sc.nextInt();

    for (int i = 1;a>=i ;a--) {
      for (int j = 1;j<=a ;j++ ){
        System.out.print("*   ");
      }
      System.out.println();
    }



    
  }
}