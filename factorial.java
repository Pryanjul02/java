import java.util.Scanner ;
public class factorial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in );
        System.out.println("Enter the no.");
        int num=input.nextInt();
        long factorial= 1;
        int  i=1;
        while(i<=num)   {
            if(num == 0){
                System.out.println( "your factorial is" + factorial );
            }
            factorial *=i;
            i++;

        }
        System.out.println( "your factorial is " + factorial);
    }
}
