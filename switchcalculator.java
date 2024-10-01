import java.util.Scanner;
public class switchcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter the first number ");
        int first = input.nextInt();
        System.out.println("Enter the Second number ");
        int second = input.nextInt();
        System.out.println("Enter the operation u want to perform ");
        String operation = input.next();
        int result =  switch (operation){
            case "addition" -> first +second;

            case "subtraction" ->
                    first - second ;

            case "multiplication" ->
                    first*second;

            case "division" ->
                    first/second;

            case "modulous" ->
                    first%second;
            default -> 0;

        };
        System.out.println("required results " + result );

    }


}
