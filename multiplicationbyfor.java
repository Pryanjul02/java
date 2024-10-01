import java.util.Scanner;
public class multiplicationbyfor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to see the table: ");
        int a = input.nextInt();
        int i = 0;


        for (i = 1; i < 11; i++) {
            int result = a * i;
            System.out.println(a + "*" + i + "=" + result);
        }


    }
}