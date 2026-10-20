import java.util.Scanner;
public class Day49{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
  System.out.print("masukkan nilai");
    int nilai = sc.nextInt();



    String status =(nilai>=80)?"lulus":"tidak lulus";
    System.out.print(status);

  // bisa juga langsung sout System.out.print((nilai>=80)?"lulus":"tidak lulus");
    
  }
}