import java.util.Scanner;
import java.util.Locale;

public class SembilanVariabel {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
      

        // Input 9 variabel dengan tipe data berbeda
        String var1 = input.next();       // 1. String
        byte var2 = input.nextByte();     // 2. byte
        short var3 = input.nextShort();   // 3. short
        int var4 = input.nextInt();       // 4. int
        long var5 = input.nextLong();     // 5. long
        float var6 = input.nextFloat();   // 6. float (3,14)
        double var7 = input.nextDouble(); // 7. double (1,618)
        char var8 = input.next().charAt(0); // 8. char (A)
        boolean var9 = input.nextBoolean(); // 9. boolean (true)

        input.close();

    

        // === PRINTLN ===
        System.out.println("=== PRINTLN ===");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);

        // === PRINT ===
        System.out.println("=== PRINT ===");
        System.out.print(var1 + "\n" + 
                           var2 + "\n" + 
                           var3 + "\n" + 
                           var4 + "\n" + 
                           var5 + "\n" + 
                           var6 + "\n" +
                           var7 + "\n" +
                           var8 + "\n" + 
                           var9 + "\n");

        // === PRINTF ===
        System.out.println("=== PRINTF ===");
        System.out.printf("%s%n%d%n%d%n%d%n%d%n%.2f%n%.3f%n%c%n%b%n", 
                          var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }
}