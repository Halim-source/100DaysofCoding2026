import java.util.Scanner;
public class Day48{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    
    System.out.print("enter angka 1 =");
    int a =sc.nextInt();
    
System.out.print("masukkan operator +,-,/,* =");
 char c =sc.next().charAt(0);
    
    System.out.print("enter angka 2 =");
    int b =sc.nextInt();
    
    switch(c){
      case '+': System.out.println(a+b);break;
      case '-': System.out.println(a-b);break;
      case '*': System.out.println(a*b);break;
      case '/': System.out.println(a/b);break;
        
      default : System.out.print("eror");
        


}

    
  }
}