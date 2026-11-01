import java.util.Scanner;
public class Day60{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Masukkan angka N =");
    int N =sc.nextInt();
    int a =1;
    long kali =1;
    if(N<1){
        System.out.println("N minimal 1");
    }else{
      while(a<=N){
    System.out.print(a+" ");
      kali *=a;
      a++;
       }
      System.out.println("\ntotal perkalian dari angka 1-"+N+"="+kali);
    }
  }
}