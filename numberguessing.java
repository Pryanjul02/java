import java.util.Scanner;
public class numberguessing {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int num=5,guess;

        do {
            System.out.println("Enter your number: ");
            guess = input.nextInt();
        }while(!(num==guess));

        System.out.println("Congratulations !!! you sucessfully guess the no.");
    }
}
