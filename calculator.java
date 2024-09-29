import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    System.out.println("Calculator");
         System.out.println("enter your first no.");
         int a = input.nextInt();
         System.out.println("Enter your second no.");
         int b = input.nextInt();
         int sum= a+b;
         int mul = a*b;
         float div= a/b;
         int mod = a%b;
         int sub = a-b;
         System.out.println("sum= " + sum);
         System.out.println("multiplication= " +mul);
         System.out.println("division= " + div);
         System.out.println("modulous= " + mod);
         System.out.println("subtraction= " + sub);

}
}
