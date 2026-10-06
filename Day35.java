import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nilai = ");
        int nilai = sc.nextInt();

        System.out.print("Enter kehadiran = ");
        int hadir = sc.nextInt();

        if (nilai >= 85) {
            if (hadir >= 75) {
                System.out.println("Lulus dengan nilai A");
            } else {
                System.out.println("Anda mengulang karena kehadiran kurang");
            }
        } else {
            System.out.println("Nilai belum mencapai 85");
        }
    }
}