import java.util.Scanner;
public class Day78{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("=====BUAT AKUN====");
    System.out.print("buat username:");
    String user= sc.nextLine();
    System.out.print("buat password:");
    String pass =sc.nextLine();
    String username;
    String password;
    do{
      System.out.println("====LOGIN KE AKUN====");
      System.out.print("input username:");
      username =sc.nextLine();
      System.out.print("input password:");
      password =sc.nextLine();
      if(user.equals(username)&&pass.equals(password)){
        System.out.print("LOGIN BERHASIL");
        
      }else{
        System.out.println("username atau password salah");
      }
    }while(!user.equals(username)||!pass.equals(password));
  }
}