 import java.util.Scanner;
public class Absolute {
    @SuppressWarnings("resource")
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);
        System.out.println("Enter your no. ");
        int num = input.nextInt();

        int result = num>=0? num:-num;
        System.out.println(result);
    }


}


