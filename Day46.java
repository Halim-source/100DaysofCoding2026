import java.util.Scanner;
public class Day45{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println(=====menu=====);
    System.out.print("1=nasi goreng\n");
    System.out.print("2=nasi kuning\n");
    System.out.print("3=gado gado\n");
    System.out.print("4=jalan kote\n");
    int menu =sc.nextInt();

    switch(menu){
      case 1:
        System.out.print("anda memesan nasi goreng");break;
      case 2:
        System.out.print("anda memesan masi kuning");break;
      case 3:
        System.out.print("anda memesan gado gado");break;
      case 4:
        System.out.print("anda memesan jalan kote");break;
    
    default :
      System.out.print("masukkan angka 1-4");break;
    }
  }
}