import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number ");
        int num = input.nextInt();

        Boolean prime=isprime(num);

        if (prime == false){
            System.out.println("no. is not  prime");
        }
        else{
            System.out.println("no. is prime ");
        }


    }
    public  static  boolean isprime(int a) {
        int i=2;
        while (i<a){

            if(a%i==0){
                return false ;
            }
            i++;


        }
        return true;


    }
}
