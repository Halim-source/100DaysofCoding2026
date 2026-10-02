import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter angka a : ");
        int a = sc.nextInt();
        System.out.print("enter angka b : ");
        int b = sc.nextInt();
        
        System.out.println("(&&)angka a> angka b,angka a< angka b  : " +(a > b && a < b));
        System.out.println("(||)angka a> angka b,angka a< angka b  : " +(a > b || a < b));
        System.out.println("!(false jadi true dan sebaliknya,angka a >100 ="+(a>100));
}
}