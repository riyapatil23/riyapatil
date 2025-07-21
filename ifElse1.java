import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the value of num1 : ");
         int num1 = sc.nextInt();
        
         System.out.println("Enter the value of num2 : ");
         int num2 = sc.nextInt(); 

         if(num1 > num2) {
            int sub = num1 - num2;
            System.out.println("Subtraction of given number " + sub);
         }
         else if (num2 > num1) {
            int sub = num2 - num1;
            System.out.println("Subtraction of given number " + sub);
         }
    }
    
}
