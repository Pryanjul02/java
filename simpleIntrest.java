import java.util.Scanner;
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Principal Amount ");
        double principal = input.nextDouble();
        System.out.println("Enter the rate ");
        double rate = input.nextDouble();
        System.out.println("Enter the time ");
        double time = input.nextDouble();
        double simpleinterest= (principal*rate*time)/100;
        System.out.println("your claculated simple interest is = " + simpleinterest);

    }
}
