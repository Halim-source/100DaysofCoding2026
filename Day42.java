import java.util.Scanner;
public class Day42{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
 System.out.print("masukkan gaji perbulan=");
double gaji =sc.nextDouble();
    
 System.out.print("masukkan tunjagan perbulan=");
double tunjangan =sc.nextDouble();
System.out.print("masukkan potongan gaji perbulan= ");
    double pajak =sc.nextDouble();
    double gajikotor =gaji+tunjangan;
    double gajibersih =gajikotor-pajak;
    System.out.printf("gaji bersih anda perbulan adalah=%.0f",gajibersih);
    
  }
}