import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number ");
        int num = input.nextInt();
        String name = getmonth(num);
        if (num<13){  System.out.println("name of the month is " + name );}
        else{System.out.println(name);}



    }

    public static String getmonth(int  num){
        return switch(num){
            case 1 -> "janaurary";
            case 2 -> "ferbuary";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "september";
            case 10 -> "october";
            case 11 -> "november";
            case 12 -> "december";
            default ->"please enter a valid number";
        };//semicolons are necessary
    }


}
