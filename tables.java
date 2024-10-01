import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number of which you want to see a table ");
        int a=input.nextInt();
        int i=1;


        while(i<=10){
            System.out.println(a + "X" + i + "=" + (a*i) );
            i++;

        }
    }
}
