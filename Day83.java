import java.util.*;

public class Day82 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan jumlah indeks:");
    int indeks =sc.nextInt();
    int [] array = new int[indeks];
    int maks =Integer.MIN_VALUE;
    
    for(int i =0;i<array.length;i++){
      System.out.println("enter nilai indeks ke-"+i);
     array[i] =sc.nextInt();
      if(array[i]>maks)
        maks =array[i];
    }System.out.print("angka tebesarnya adalah "+maks);
 
}
  }

