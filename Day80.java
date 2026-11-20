import java.util.*;
public class Day80{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] array ={1,2,3,4,5,6,7,8,9,10};

    System.out.print("masukkan nomor indeks yang mau diakses:");
    int indeks =sc.nextInt();
    if(indeks>=0&&indeks<array.length){
      System.out.print("nilai pada indeks "+indeks+" adalah:"+array[indeks]);
    }else{
      System.out.print("indeks yang ada mulai dari 0-"+(array.length-1));
    }
      
  }
}