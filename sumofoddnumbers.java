import java.util.Scanner;
public class sumofoddnumbers {
    public static void main(String[] args) {
        Scanner input =   new Scanner (System.in);
        System.out.println("Enter the no. till which you want to add odd no.s ");
        int a= input.nextInt();
        int i=1;
        int sum=0;



        while(i<=a){
            sum+=i;
            i+=2;



        }
        System.out.println("your required result is " + sum);

    }
}



