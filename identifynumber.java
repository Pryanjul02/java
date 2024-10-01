import java.util.Scanner;
public class identifynumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter your number ");
    int a = input.nextInt();
    if( a>0){
        System.out.println("no.is positive");

    }
    else if (a<0){
        System.out.println("number is negative");

    }
    else {
        System.out.println("your number is zero");
    }
}
}
