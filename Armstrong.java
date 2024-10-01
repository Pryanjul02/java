import java.util.Scanner;
public class Armstrong {
    public static void main(String[]  args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = input.nextInt();
        boolean Armstrong=isArmstrong(num);
        if(Armstrong==true){
            System.out.println("given no. is a armstrong no.");

        }
        else{
            System.out.println("given no. is not a armstrong no.");
        }

    }
    public static boolean isArmstrong( int num){ // identification

        int noofdigits=Digits(num);
        int copy=num;
        int finaldigit=0;
        while(num>0){
            int lastdigit=num%10;
            num/=10;
            finaldigit+=pow( lastdigit ,noofdigits);

        }


        return finaldigit==copy;
    }
    public static int pow(int num1,int num2){//power of an individual no. like square , cube etc.
        int result=num1;
        int i=1;
        while(num2>i){
            result *=num1;
            i++;


        }
        return result;

    }

    public static int Digits(int  num){//count no. of digits
        int digit = 0;

        while (num>0){

            digit++;
            num/=10;
        }


        return digit;
    }
}

