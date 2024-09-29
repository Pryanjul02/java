import java.util.Scanner;
public class compoundInteretst {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the principal amount ");
        float principal=input.nextFloat();
        System.out.println("Enter your rate ");
        float rate = input.nextFloat();
        System.out.println("Enter your time ");
        float time = input.nextFloat();
        double compound= principal * Math.pow((1+rate/100), time);
        System.out.println("compund Intrest = " + compound);
    }
    
}
