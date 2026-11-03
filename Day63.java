import java.util.Scanner;
public class day63 {
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int M = sc.nextInt();
        System.out.print("Masukan nilai pangkat: ");
        int N = sc.nextInt();
   
        long hasil=1;

            for (int i = 1; i <=N; i++) {
                hasil *=M;
                System.out.print(M+"*");
                
            }
            System.out.println(" = "+hasil);
        }

      

    }
    
