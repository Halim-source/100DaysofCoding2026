import java.util.Scanner;

public class Day75{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
   String teks1 ="MAJENE";
     System.out.println(teks1);
System.out.println();
   
   System.out.println("masukkan teks kedua/pembanding");
   String teks2 = sc.nextLine();

   System.out.println("kata yang mau dicari");
   String f =sc.nextLine();
   
  System.out.println( "=========hasil=========");
   //equalse teks 1 dan 2 sama persis
   System.out.println("1.equals ="+teks1.equals(teks2));
   //equalsIgnoreCase kalimat sama tanpa melihat huruf besar/kecil
   System.out.println("2.equalsIgnoreCase="+teks1.equalsIgnoreCase(teks2));
   //mencari kata
   System.out.println("3.contains ="+(teks1.contains(f)||teks2.contains(f)));
   //isEmpty apa kalimat kosong
   System.out.println("4.isEmpty ="+teks2.isEmpty());
  

  
}

}