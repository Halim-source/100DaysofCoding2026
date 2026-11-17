import java.util.Scanner;
public class Day77{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan sebuah teks:");
    String teks =sc.nextLine();
    System.out.println("length(jumlah karakter) ="+teks.length());
    System.out.println("toUpperCase(huruf besar) ="+teks.toUpperCase());
    System.out.println("toLowerCase(huruf kecil) ="+teks.toLowerCase());
    System.out.println("===========");
    System.out.print("masukkan teks pertama:");
    String teks1 = sc.nextLine();
    System.out.print("masukkan teks kedua:");
    String teks2 = sc.nextLine();
    System.out.print("masukkan kata yg mau dicari pada kedua teks:");
    String S = sc.nextLine();
    System.out.println("equals(kedua teks sama persis:"+teks1.equals(teks2));
    System.out.println("equalsIgnoreCase(kedua teks sama :"+teks1.equals(teks2));
    System.out.println("kata yang dicari:"+(teks1.contains(S)||teks2.contains(S)));
    System.out.println("apa teks satu atau dua kosong:"+(teks1.isEmpty()||teks2.isEmpty()));
    System.out.println("===============");
    System.out.print("masukkan sebuah teks: ");
        String take = sc.nextLine();
        System.out.print("masukkan indeks awal substring: ");
        int awal = sc.nextInt();
        System.out.print("masukkan indeks akhir substring: ");
        int akhir = sc.nextInt();
        
        sc.nextLine();
        System.out.print("masukkan teks yang ingin diganti: ");
        String teksLama = sc.nextLine();
        System.out.print("masukkan teks pengganti: ");
        String teksbaru = sc.nextLine();
        
        System.out.println();
        if(awal >= 0 && akhir <= take.length() && awal <= akhir) {
            System.out.println("substring = " + take.substring(awal, akhir));
        }else{
            System.out.println("substring = indeks awal mulai dari 0 & indeks akhir tidak boleh lebih "+teks.length());
        }
        System.out.println("replace   = " + take.replace(teksLama,teksbaru));
        System.out.println("trim      = " + take.trim());
        
  }
}