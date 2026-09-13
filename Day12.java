import java.util.Scanner;

public class Day11{

  public static void main(String[] args) {

    Scanner biodata =new Scanner(System.in);

    System.out.println("==========lengkapi biodata anda==========");
    
    System.out.print(" masukkan nama   : ");
    String nama =biodata.next();

    System.out.print(" masukkan umur   : ");
    int umur =biodata.nextInt();

    System.out.print(" masukkan alamat : ");
    String alamat=biodata.next();

    //output
    System.out.printf("nama saya %s.umur saya %d tahun.saya tinggal di %s", nama,umur,alamat);
  
  }
}