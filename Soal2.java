import java.util.Scanner;

public class soal2{

public static void main(String[] args) {
  Scanner scan1 =new Scanner(System.in);

System.out.print("masukkan nama :");
String nama =scan1.nextLine();

System.out.print("masukkan umur :");
int umur =scan1.nextInt();

System.out.print("masukkan tb :");
double tb =scan1.nextDouble();

  System.out.printf("nama saya %s,umur saya %d tahun,tinggi saya %.2f cm", nama,umur,tb);
  
}
  
}