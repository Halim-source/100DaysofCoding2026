import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pilihan;

        do {

            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. tampilkan biodata");
            System.out.println("2. tampilkan hobi");
            System.out.println("3. tampilkan jurusan");
            System.out.println("4. keluar");

            System.out.print("\npilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("nama: Halim");
                    System.out.println("Status: Mahasiswa\n");
                    break;

                case 2:
                    System.out.println("Hobi: Main Futsal\n");
                    break;

                case 3:
                    System.out.println("Jurusan: Teknik Informatika\n");
                    break;

                case 4:
                    System.out.println("program selesai");
                    break;

                default:
                    System.out.println("masukkan menu nomor 1-4");
            }

        } while (pilihan != 4);

        sc.close();
    }
}