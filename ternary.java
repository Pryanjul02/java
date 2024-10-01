
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your 1 no. ");
        int first=input.nextInt();
        System.out.println("Enter your second no.");
        int second = input.nextInt();

        ternary minimumternary = new ternary();//we can not call non-static method in static that is why we create a object of this class.
        int min =minimumternary. min(first,second);
        System.out.println("minimum no is "+ min);

        boolean number = ternary.oddeven(first);
        System.out.println(number );
    }

    public int min( int first, int second){

        return first > second?second:first;
    }

    public static boolean oddeven(int number){

        return number%2==0?true:false;
    }
}
