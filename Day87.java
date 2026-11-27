import java.util.*;
public class Day87{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan jumlah indeks:");
    int indeks = sc.nextInt();
    int [] array = new int[indeks];
    for (int i =0;i<array.length;i++){
      System.out.print("masukkan nilai indeks ke "+i+":");
      array[i]=sc.nextInt();
    }
    System.out.print("masukkan indeks yang mau diganti nilainya:");
    int ganti =sc.nextInt();
    System.out.print("masukkan nilai baru:");
    int baru =sc.nextInt();
    array[ganti] =baru;
    System.out.print("hasil:");
    for (int i =0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.print("\nmasukkan indeks yg mau dihapus:");
    int hapus =sc.nextInt();
    int [] arrayHapus = new int[array.length - 1];
    for (int i =0, j =0;i<array.length;i++){
      if (i != hapus){
        arrayHapus[j] = array[i];
        j++;
      }
    }
    array = arrayHapus;
    System.out.print("hasil:");
    for (int i =0; i <array.length; i++) {
      System.out.print(array[i]+" ");
    }
    System.out.print("\nmasukkan nilai yang mau ditambah kedalam array: ");
    int tambah =sc.nextInt();
    int [] arrayTambah = new int[array.length + 1];
    for (int i =0;i<array.length;i++){
      arrayTambah[i] = array[i];
    }
    arrayTambah[arrayTambah.length - 1] = tambah;
    array = arrayTambah;
    System.out.print("hasil:");
    for (int i =0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
  }
}
