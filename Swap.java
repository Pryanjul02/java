import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first no.");
        int firstnum = input.nextInt();
        System.out.println("enter your second no, ");
        int secondnum= input.nextInt();
        int temp= firstnum;
        firstnum= secondnum;
        secondnum = temp;
        System.out.println("After Swapping\n first no. " + firstnum);
        System.out.println("second no. " + secondnum);


    }
}
