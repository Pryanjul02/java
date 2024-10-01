import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        System.out.println("please enter your first number: ");
        Scanner input = new Scanner (System.in);
        int firstnum= input.nextInt();
        System.out.println("enter your second no.: ");
        int secondnum= input.nextInt();

        int sum= firstnum + secondnum;
        System.out.println("sum of two numbers " + sum);




    }
}
