import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka untuk dicari faktorialnya: ");
        int n = sc.nextInt();  
        long faktor = 1; 
      if(n<1){
        System.out.println("angka n minimal 1");

        
      }
      else  {
        
        for (int i = n; i > 0; i--) {
            faktor *= i;
        }
        
        System.out.println(n+"!"+"adalah: " + faktor);
      }
    }
}
