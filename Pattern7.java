public class Pattern7 {
    public static void main(String[] args) {
 // 1
// 2 3
// 4 5 6
int n = 5;
 int cnt = 1;
for(int row = 1; row <= n; row++) {
  for(int col = 1;col <= row; col++){
    System.out.print(" " + cnt + " "); 
    cnt++;
}
  System.out.println();
}
    }
}
