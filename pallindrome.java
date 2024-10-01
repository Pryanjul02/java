import  java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num=input.nextInt();
        boolean Palindrome= ispalindrome(num);
        if(Palindrome==true){
            System.out.println("given no. is a palindrome");
        }
        else{
            System.out.println("given no. is not a palindrome");
        }

    }
    public static boolean ispalindrome( int num){
        int number=reverse(num);
        if (number==num){
            return true;
        }
        else {
            return false;
        }
    }
    public static int reverse(int num){
        int newnum=0;
        while(num>0){
            int digit= num%10;
            newnum= newnum*10 +digit;
            num/=10;

        }

        return newnum;
    }
}

