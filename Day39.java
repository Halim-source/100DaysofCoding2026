import java.util.Scanner;
public class Day39{
  public static void main(String[]args){
Scanner sc =new Scanner(System.in);
    System.out.print("enter angka 1 =");
    int a =sc.nextInt();
    System.out.print("pilih operasi (+,-,*,/) ");
    char b =sc.next().charAt(0);
    System.out.print("enter angka 2 =");
    int c =sc.nextInt();
    if (b=='+') {
      System.out.print("hasil dari "+a+"+"+c+"adalah ="+(a+c));
    }else if(b=='-'){
      System.out.print("hasil dari "+a+"-"+c+"adalah ="+(a-c));
    }else if(b=='*'){
      System.out.print("hasil dari "+a+"*"+c+"adalah ="+(a*c));
    }else if(b=='/'){
      System.out.print("hasil dari "+a+"/"+c+"adalah ="+(a/c));
    }
    else {
      System.out.println("operator yg anda masukkan salah");
    }
      
  }
}