import java.util.Scanner;
public class oddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int a=input.nextInt();
        if(a%2==0){
            System.out.println("Given no.is even.");
        }
        else{
            System.out.println("your Number is Odd.");
        }
    }
}
