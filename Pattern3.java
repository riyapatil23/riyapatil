public class Pattern3 {
    public static void main(String[] args) {
   //      1
   //   2     2
  // 3    3     3     
     for (int row = 1; row <= 3; row++) {
            for(int space= 1; space <= 3- row; space++) {              
                System.out.print(" " );
        }                           
             for(int col = 3-row+1; col <=3; col++) {
        System.out.print(" " + row + " ");
             }
            System.out.println( " ");
       }
    }
    
}
