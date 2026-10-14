import java.util.Scanner;
public class Day43{
  public static void main(String[]args){
 Scanner sc =new Scanner(System.in);

  System.out.print("enter angka kelipatan 3/5 =");
int a =sc.nextInt();

  if(a%3==0&&a%5==0){
    System.out.println(a+" adalah angka kelipatan3/5");
    System.out.println(a+" adalah angka kelipatan3/5");
  }else if(a%3==0){
    System.out.println(a+" adalah angka kelipatan3");
    
  }else if(a%5==0){
    System.out.println(a+" adalah angka kelipatan5");
    
  }else{
    System.out.println(a+" bukan angka kelipatang 3/5");
    
  }

    
  }
}