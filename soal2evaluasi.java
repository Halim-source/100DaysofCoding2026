import java.util.Scanner;
public class soal2{
  public static void main(String[] args) {
Scanner sc  =new Scanner(System.in);
System.out.print("enter angka 1=");
    int a =sc.nextInt();
System.out.print("enter angka 2=");
    int b =sc.nextInt();

if (a>b) {
  System.out.println(a-b);
}else {
  System.out.println(b-a);
}

    
  }
}