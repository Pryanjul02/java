import java.util.Scanner;
public class stringmanipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print( " enter your first String: ");
        String a = input.next();
        System.out.print("Enter your second string: ");
        String b = input.next();
        String c = a.concat(" ").concat(b);

        System.out.print(c.toUpperCase());

    }
}
