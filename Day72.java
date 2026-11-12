import java.util.Scanner;
public class Day72{public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int total = 0;
     int angka;
 System.out.println("masukkan angka (negatif untuk berhenti):");

   while ((angka =sc.nextInt())>=0) {
     total += angka;
        }
        System.out.println("total: "+total);
    }
}