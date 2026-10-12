import java.util.Scanner;
public class  Day41{
  public static void main(String[]args){
Scanner sc =new Scanner(System.in);
    System.out.println("masukkan suhu ruangan saat ini");
    int suhu =sc.nextInt();

    if (suhu<=20){
      System.out.println("suhu ruangan dingin");
    }else if (suhu>=21&&suhu<=39) {
      System.out.println("suhu ruangan lumayan panas");
    }else if (suhu>=40&&suhu<=60){
      System.out.println("suhu ruangan sangat panas");
    }else{
      System.out.println("suhu panas level max");
    }


    
  }
}