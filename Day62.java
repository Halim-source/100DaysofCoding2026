import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int x = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int y = in.nextInt();

        

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        in.close();
    }
}