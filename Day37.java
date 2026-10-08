import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input angka = ");
        int a = sc.nextInt();

        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("angka positif genap");
            } else {
                System.out.println("angka positif ganjil");
            }

        } else if (a < 0) {
            if (a % 2 == 0) {
                System.out.println("angka negatif genap");
            } else {
                System.out.println("angka negatif ganjil");
            }

        } else {
            System.out.println("ini angka nol");
        }
    }
}