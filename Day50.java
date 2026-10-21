import java.util.Scanner;
public class Day50{
  public static void main(String[]args){

Scanner sc = new Scanner(System.in);
    
    System.out.print("enter angka 1 =");
    int a = sc.nextInt();
    
    System.out.print("enter angka 2 =");
    int b = sc.nextInt();

    System.out.print((a%2==0 && b%2==0)?"kedua bilangan genap":"salah satu ganjil dan genap"
                    
        );
  }
}