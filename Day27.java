import java.util.Scanner;
public class Day27{
public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
int angka =sc.nextInt();

  System.out.println("angka awal"+angka);

  angka++;
    System.out.println("after angka++"+angka);
  ++angka;
    System.out.println("after ++angka"+angka);
  angka--;
    System.out.println("after angka--"+angka);
  --angka;
    System.out.println("after --angka"+angka);
}

  
}