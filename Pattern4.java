public class Pattern4 {
    public static void main(String[] args) {
        // 1
       //    2 
    //         3
   for(int row = 1; row <=3; row++) {    
     for(int space = 1; space<=row; space++) {
            System.out.print("   ");
       }
        System.out.println( " "+ row);
    }
    }
    
}
