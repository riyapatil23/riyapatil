import java.util.Scanner;
public class switch {
        public static void main(String[] args) {
        // a - b ; b < a   or b-a ; b>a
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n) {
          case 1 : System.out.println("you have opted for marathi language");
          break;
          case 2 : System.out.println("you have opted for hindi language");
          break;
          case 3 : System.out.println("you have opted for english language");
          break;
          default : System.out.println("you have opted for none");
        }

         

    }
    
}

    
}
