import java.util.*;
public class Day81{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("masukkam jumlah data :");
    int jumlah =sc.nextInt();
    int[] array = new int[jumlah];
    
    for (int i =0;i<array.length ;i++ ) {
      System.out.print("masukkan nilai indeks ke-"+i+":");
      array[i]=sc.nextInt();
      
    }
    System.out.println();

   for(int i =0;i<array.length;i++){
           System.out.println("nilai indeks ke-"+i+" adalah:"+array[i]);
     
   }
    
  }
}