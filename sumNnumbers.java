import java.util.Scanner;
public class sumNnumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of N ");
        int num = input.nextInt();
        int i=1;
        int sum=0;
        System.out.println("no. are need to be add");
        while(i<=num){

            System.out.println(i);

            sum+=i;
            i++;
        }
        System.out.println("required sum is "+ sum);

    }
}
