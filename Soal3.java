import java.util.Scanner;
public class soal3{

public static void main(String[] args) {

Scanner scan1 =new Scanner(System.in);

  System.out.println("===========PROFIL AKADEMIK===========");
  System.out.print("Nama               :");
  String nama =scan1.nextLine();
  System.out.print("Nim                :");
  String nim =scan1.nextLine();
  System.out.print("Program Studi      :");
  String prodi =scan1.nextLine();
  System.out.print("Fakultas           :");
  String fakultas =scan1.nextLine();
  System.out.print("Perguruan tinggi   :");
  String univ =scan1.nextLine();
  System.out.println("====================================");

  //out
  
  System.out.println("===========PROFIL AKADEMIK===========");
  System.out.println("nama               :"+nama);
  System.out.println("Nim                :"+nim);
  System.out.println("Program Studi      :"+prodi);
  System.out.println("Fakultas           :"+fakultas);
  System.out.println("Perguruan tinggi   :"+univ);
  System.out.println("===========PROFIL AKADEMIK===========");
  
}

  
}