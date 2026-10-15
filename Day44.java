import java.util.Scanner;
public class Day44{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);

  System.out.print("masukkan nilai ujian anda =");
    int nilai =sc.nextInt();
  if(nilai>=90){
    System.out.print("PREDIKAT A");
  }else if(nilai>=80){
    System.out.print("PREDIKAT B");
  }else if(nilai>=70){
    System.out.print("PREDIKAT C");
  }else if(nilai>=60){
    System.out.print("PREDIKAT D");
  }else if(nilai>=50){
    System.out.print("PREDIKAT E");
  }else{
    System.out.print("NILAI RENDAH");
  }




    
  }
}
