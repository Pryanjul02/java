import java.util.Scanner;
public class gratestAmongThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marketo now your grades:");
        int marks= input.nextInt();
        if(marks>90){
            System.out.println(" your grade is A");

        }
        else if(marks>75){
            System.out.println("your grade is B");
        }
        else if(marks>60){
            System.out.println("Your grade is C");
        }
        else if (marks>30){
            System.out.println("your grade is D");
        }
        else {
            System.out.println("your grade is F");
        }
    }
}
