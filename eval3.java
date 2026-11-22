import java.util.*;
public class dy{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("===soal 1===");
    String nama =sc.nextLine();
    String prodi =sc.nextLine();

    System.out.println("perkenalkan saya "+nama+", dari prodi "+prodi);
    
    System.out.println("===soal 2===");
    String a ="Hello,World!";
    int b =1;
    while(b<=10){
      b++;
      System.out.println(a);
    }
    
    System.out.println("===soal 3===");
    String teks =sc.nextLine();
    int c =sc.nextInt();
    int d =1;
    while(d<=c){
      d++;
      System.out.println(teks);
    }
  }
}