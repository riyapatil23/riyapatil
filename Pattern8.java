public class Pattern8 {
    public static void main(String[] args) {
//a 
//b c
//d e f
// a = 97 , A = 65 
int n = 5;
 int cnt = 0;
for(int row = 1; row <= n; row++) {
  for(int col = 1;col <= row; col++){
    System.out.print(" " + (char)(cnt + 'a') + " "); 
    cnt++;
  }
  System.out.println();

 
}
    }
    
}
