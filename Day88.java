public class day88 {
    public static void main(String[] args) {

       loop1 (1, 10);
       loop1 (11, 20 );
       loop1 (21, 30);
      
       loop2 (10, 1);
       loop2 (20, 11 );
       loop2 (30, 21);
      
      
    }
  static void loop1(int awal,int akhir ) {
    for (int i = awal; i<= akhir;i++) {
      System.out.print(i+" ");
    }System.out.println();
  }
  static void loop2( int awal,int akhir ){
    for (int i =awal; i >= akhir;i--) {
      System.out.print(i+" ");
    }System.out.println();
  }
  
}
