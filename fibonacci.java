import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("enter the number up to which fibonacci series suppose to be printed ");
        int num = input.nextInt();
        int a=0,b=1;

        System.out.println("Fibonacci series ");

        while(a+b<=num){

            int c;
            c=a+b;//third=first+second
            System.out.println( c + " ");
            a=b;//first = second
            b=c;//second = third(swapping )


        }
    }
}
