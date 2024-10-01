

import java.util.Scanner;
public class lcm{
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int first = input.nextInt();
        System.out.println("Enter your second Number ");
        int second = input.nextInt();

        int a=LCM(first,second);
        System.out.println(" LCM of given no.is " + a);




    }
    public static int LCM ( int first,int second ){
        int i =1;

        while (true){
            int factor=first*i;

            if(factor%second==0){// read the table of first no. so the multiple (first*i) should be divisible by second.

                return factor;

            }
            i++;



        }


    }
}