import java.util.Scanner;
public class reversedigit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number ");
        int num = input.nextInt();
        int Rno=reversenumber(num);
        System.out.println("Reverse of a given no." + Rno);

    }
    public static int reversenumber(int num){
        int digit = 0;
        int newnum=0;
        while(num>0){
            digit = num%10;
            newnum= newnum*10 + digit;
            num/=10;

        }

        return newnum;
    }

}

