import java.util.Scanner;
public class fibonaccirecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your no. terms at which you want to print fibonacci series: ");
        int count=input.nextInt();

        for(int i=1;i<=count;i++){
            System.out.print(fibonacci(i)+" ");

        }



    }

    public static int fibonacci(int position ){


        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
//int series = fibonacci(position-1) +fibonacci(position-2);

        return fibonacci(position - 1)
                + fibonacci(position - 2);
    }
}
