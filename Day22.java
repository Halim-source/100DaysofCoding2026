
public class Day22 {

    public static void main(String[] args) {
      

 int a =5;
int b =10;
       System.out.println("angka A ="+a);
       System.out.println("angka B ="+b);
      
      System.out.println("sebelum ditukar");
        System.out.println("angka A sebelum ditukar: " + a);
        System.out.println("angka B setelah ditukar: " + b);

         //rumus 
        a=a+b;
        b=a-b;
        a=a-b;

  System.out.println("setelah ditukar");
  System.out.println("angka A setelah ditukar: " + a);
  System.out.println("angka B setelah ditukar: " + b);


        
    }
}