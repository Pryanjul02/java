import java.util.Scanner;
class marksternary{


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your no. ");
        int num = input.nextInt();
        String  result = num>80?"high": (num>50?  "moderate" : "low");
        System.out.println(result);


    }
}