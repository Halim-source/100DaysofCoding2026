import java.util.*;

public class Day86 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan jumlah indeks:");
    int indeks = sc.nextInt();
    int[] array = new int[indeks];

    for (int i = 0; i < array.length; i++) {
      System.out.print("masukkan nilai indeks ke" + i + ":");
      array[i] = sc.nextInt();
    }

    System.out.print("masukkan angka yang mau dicari:");
    int f = sc.nextInt();
    System.out.println();

    int cari = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == f) {
        cari = i;
        break;
      }
    }

    if (cari != -1) {
      System.out.println(f + " ada pada indeks ke:" + cari);
    } else {
      System.out.println(f + " tidak ditemukan");
    }
  }
}
