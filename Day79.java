import java.util.Scanner;
public class Day79{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter jumlah indeks:");
   int nilai =sc.nextInt();
    int [] array = new int[nilai];

    for (int i =0;i<array.length;i++){
      System.out.print("enter nilai indeks ke-"+i+":");
      array[i]=sc.nextInt();
    }
    
  }
}