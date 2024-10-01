import java.util.Scanner;
public class forprime {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter the number : ");
        int a = input.nextInt();

        for(int i= 2;i<=a;i++ ){
            if (a%i==0){
                System.out.println("your number is not prime.");
            }
            else{
                System.out.println("your no. is prime.");
            }
            break;
        }

    }

}
