public class Pattern6 {
    public static void main(String[] args) {
//     *
//   * *
// * * * 
for(int row = 1; row <= 5 - row ; row++ ) {
for(int space = 1; space <= 5; space++  ){
  System.out.print(" " );
} 
for(int col = 5 - row +1; col <= 5; col++) {
  System.out.print("*");
}
System.out.println("*");

    }
    
}
