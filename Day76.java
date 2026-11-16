import java.util.Scanner;

public class Day76{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan sebuah teks: ");
        String teks = sc.nextLine();
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
        if(awal >= 0 && akhir <= teks.length() && awal <= akhir) {
            System.out.println("substring = " + teks.substring(awal, akhir));
        }else{
            System.out.println("substring = indeks awal mulai dari 0 & indeks akhir tidak boleh lebih "+teks.length());
        }
        System.out.println("replace   = " + teks.replace(teksLama,teksbaru));
        System.out.println("trim      = " + teks.trim());
        
      
    }
}
