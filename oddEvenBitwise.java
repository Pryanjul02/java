import java.util.Scanner;
public class oddEvenBitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number ");
        int a=input.nextInt();
        if((a&1)==0){
            System.out.println("your number is even.");

        }
        else{
            System.out.println("Your number is odd.");
        }

    }
}
