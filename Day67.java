import java.util.Scanner;
public class Day67 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
       System.out.print("masukkan jumlah sisi ");
      int tg =sc.nextInt();
        

   for (int i = 0; i <tg; i++) {
  
            for (int j = 0; j <tg; j++) {
                System.out.print("* ");
            }
     System.out.println();
   }
          
    }
}
