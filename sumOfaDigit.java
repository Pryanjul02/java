import java.util.Scanner;
public class sumOfaDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your no. ");
        int num = input.nextInt();
        int sum=0;
        int a;

        while ( num > 0){
            a = num%10;
            sum+=a;
            num/=10;


        }
        System.out.println("sum of digits is "+ sum);
    }

}
