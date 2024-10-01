import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first no.");
        int first = input.nextInt();
        System.out.println("Enter your second number ");
        int second = input.nextInt();
        int gcd= GCD (first,second);
        System.out.println("Gcd of given no. is " + gcd);



    }
    public static  int GCD(int a , int b)
    {
        int gcd=1;
        int i= 2;
        int c = least(a,b);
        while (i<=c){//c is the least no. among a and b so ,i<=least no.
            if(a%i==0 && b%i==0){

                return i;

            }
            i++;
        }
        return gcd;

    }

    public static int least (int a, int b){
        if (a<b){
            return a;
        }
        else{
            return b;
        }
    }
}
