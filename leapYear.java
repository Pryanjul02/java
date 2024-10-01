import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter your year ");
        int year=input.nextInt();
        if (year%100==0 && year%400==0){
            System.out.println("year is a leap year.");

        }

        else if(year%4==0 && year%100!=0){
            System.out.println("Year is a leap year year ");
        }
        else{
            System.out.println("year is a ordinary year.");
        }
    }
}
