import java.util.Scanner;
public class Day59{
  public static void main(String[]args){
 Scanner sc =new Scanner(System.in);

    System.out.print("masukkan batas nilai(N)     =");
    int N =sc.nextInt();
    
    System.out.print("masukkan angka kelipatan(M) =");
    int M =sc.nextInt();
    int a =M;
    
    while(a<=N){
      if(M<=0||N<1){
        System.out.println(" N harus >= 1 dan M harus > 0");
        } else {");
      }
      System.out.print(a+" ");
    a+=M;
    }


    
  }
}