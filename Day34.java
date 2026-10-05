import java.util.Scanner;
public class Day32{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
System.out.print("masukkan angka =\n");
    int nilai =sc.nextInt();

if (nilai >0 && nilai %2==0){
  System.out.println("positif genap");}
 else if (nilai >0 && nilai %2==1){
   System.out.println("positif ganjil");}
 
else {
  System.out.println("anda memasukkan angka negatif");}


    
  }
}