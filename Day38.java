import java.util.Scanner;
public class Day38{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
System.out.println("===========[[=PILIHAN MENU================");
System.out.println("           1.NASI GORENG");
System.out.println("           2.NASI KUNING");
System.out.println("           3.GADO GADO  ");
System.out.print("MASUKKAN ANGKA MENU YANG ANDA MAU PESAN ="); int a =sc.nextInt();
System.out.print("____________________________________________\n");
    int harga =0;
if (a==1){
  int b =10000;
  System.out.println("ANDA MEMESAN NASI GORENG RP ="+b);
}if(a==2){
  int b =12000;
  System.out.println("ANDA MEMESAN NASI KUNING RP ="+b);
}if (a==3){
  int b =10000;
  System.out.println("AND MEMESAN GADO GADO RP ="+b);
}else {
  System.out.println("ERROR MASUKKAN ANGKA SESUAI NOMOR MENU");
}

    
  }
}